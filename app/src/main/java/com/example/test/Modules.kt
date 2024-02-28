package com.example.test

import com.example.test.Data.DataSource.RemoteDataSource
import com.example.test.Data.DataSource.UsersAPI
import com.example.test.Data.Database.AppDatabase
import com.example.test.Data.Repo.UserRepository
import com.example.test.Domain.Repo.IUserRepository
import com.example.test.UI.DetailedPerson.DetailedPersonInformationViewModel
import com.example.test.UI.MainFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val networkModule = module {
    single<UsersAPI>{ UsersAPI.provideUsersApi() }
    single { AppDatabase.getDatabase(get())}
}

val remoteModule = module {
    single{ RemoteDataSource(usersAPI = get()) }
}

val repositoryModule = module {
    single<IUserRepository>{ UserRepository(source = get(), database = get())}
}

val viewModelModule = module {
    viewModel {
        MainFragmentViewModel(
            personRepository = get()
        )
    }
    viewModel {
        DetailedPersonInformationViewModel(
            personRepository = get()
        )
    }
}

fun getModules(): List<Module> {
    return listOf(networkModule, viewModelModule, repositoryModule, remoteModule)
}