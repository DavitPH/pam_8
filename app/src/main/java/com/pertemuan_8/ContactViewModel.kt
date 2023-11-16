package com.pertemuan_8

import androidx.lifecycle.ViewModel
import com.pertemuan_8.Data.ContactUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ContactViewModel : ViewModel() {
    private val _stateUi = MutableStateFlow(ContactUiState())
    val stateUi: StateFlow<ContactUiState> = _stateUi.asStateFlow()

    fun setContact(listContact: MutableList<String>){
        _stateUi.update{
            stateSaatIni ->
            stateSaatIni.copy(
                nama = listContact[0],
                noHp = listContact[1],
                alamat = listContact[2]
            )
        }
    }
}