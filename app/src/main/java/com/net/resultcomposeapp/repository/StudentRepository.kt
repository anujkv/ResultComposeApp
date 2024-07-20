package com.net.resultcomposeapp.repository

import android.content.Context
import com.google.gson.reflect.TypeToken
import com.net.resultcomposeapp.data.local.parseJsonData
import com.net.resultcomposeapp.model.Student
import com.net.resultcomposeapp.model.StudentListResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class StudentRepository(private val context: Context) {

    suspend fun loadStudentData(): StudentListResponse?{
        return withContext(Dispatchers.IO){
            parseJsonData(context)
        }
    }

}