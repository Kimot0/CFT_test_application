package com.example.test.UI

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.test.Domain.Entity.RandomUser
import com.example.test.Domain.Repo.IUserRepository
import com.example.test.Utils.Event
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.launch

class MainFragmentViewModel(
    private val personRepository: IUserRepository
) : ViewModel() {
    private val _personInformationStateFlow = MutableStateFlow<Event<List<RandomUser>>?>(null)
    val personInformationStateFlow = _personInformationStateFlow.asStateFlow().filterNotNull()

    init {
        getUser()
    }

    fun getUser() {
        viewModelScope.launch {
            try {
                _personInformationStateFlow.emit(Event.loading())
                val users = personRepository.getRandomUser()
                _personInformationStateFlow.emit(Event.success(users))
            } catch (e: Exception) {
                _personInformationStateFlow.emit(Event.error(e))
            }
        }
    }
    fun updateUsers(){
        viewModelScope.launch {
            try {
                _personInformationStateFlow.emit(Event.loading())
                val users = personRepository.updateUsersList()
                _personInformationStateFlow.emit(Event.success(users))
            } catch (e: Exception) {
                _personInformationStateFlow.emit(Event.error(e))
            }
        }
    }
}