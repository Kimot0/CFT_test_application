package com.example.test.UI.DetailedPerson

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.test.Domain.Entity.RandomUser
import com.example.test.Domain.Repo.IUserRepository
import com.example.test.Utils.Event
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.launch

class DetailedPersonInformationViewModel(
    private val personRepository: IUserRepository
)  : ViewModel(){
    private val _personInformationStateFlow = MutableStateFlow<Event<List<RandomUser>>?>(null)
    val personInformationStateFlow = _personInformationStateFlow.asStateFlow().filterNotNull()

    init {
        getUser()
    }

    fun getUser() {
        viewModelScope.launch {
            try {
                _personInformationStateFlow.emit(Event.loading())
                val person = personRepository.getRandomUser()
                _personInformationStateFlow.emit(Event.success(person))
            } catch (e: Exception) {
                _personInformationStateFlow.emit(Event.error(e))
            }
        }
    }
}