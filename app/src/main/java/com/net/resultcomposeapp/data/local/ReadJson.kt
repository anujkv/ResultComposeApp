package com.net.resultcomposeapp.data.local

import android.content.Context
import com.google.firebase.crashlytics.buildtools.reloc.com.google.common.reflect.TypeToken
import com.google.gson.Gson
import com.net.resultcomposeapp.model.StudentListResponse
import java.io.IOException
import java.lang.reflect.Type

fun Context.readJsonFromAssets(fileName: String): String? {
    return try {
        val inputStream = assets.open(fileName)
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        String(buffer, Charsets.UTF_8)

    } catch (e: IOException) {
        e.printStackTrace()
        null
    }
}


fun parseJsonData(context: Context): StudentListResponse? {
    val jsonString = context.readJsonFromAssets("student_list.json")
    if(jsonString !=null){
        try {
            val gson = Gson()
            val studentListType: Type = object : com.google.gson.reflect.TypeToken<StudentListResponse>() {}.type
            val studentList: StudentListResponse = gson.fromJson(jsonString, studentListType)
            return studentList
        } catch (e: Exception) {
            e.printStackTrace()
            return null
        }
    }else{
        return null
    }
}
