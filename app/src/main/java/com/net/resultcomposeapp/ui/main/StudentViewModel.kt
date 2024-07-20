package com.net.resultcomposeapp.ui.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.net.resultcomposeapp.model.Student
import com.net.resultcomposeapp.model.StudentListResponse
import com.net.resultcomposeapp.repository.StudentRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class StudentViewModel(application: Application) :
    AndroidViewModel(application) {
    private val repository = StudentRepository(application)
    private val _studentList = MutableStateFlow<StudentListResponse?>(null)
    val studentFlow: StateFlow<List<Student>> = _studentList
        .map { response ->
            response?.student_list ?: emptyList()
        }
        .stateIn(viewModelScope, SharingStarted.Eagerly, emptyList())

    fun loadStudentData() {
        viewModelScope.launch {
            _studentList.value = repository.loadStudentData()
        }
    }
}