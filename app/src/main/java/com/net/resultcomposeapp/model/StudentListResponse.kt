package com.net.resultcomposeapp.model

data class StudentListResponse(
    val page: Int,
    val student_list: List<Student>,
    val total_pages: Int,
    val total_results: Int
)

data class Student(
    val blood_group: String,
    val class_name: String,
    val contact: String,
    val dob: String,
    val father: String,
    val final_term: List<FinalTerm>,
    val final_term_gpa: String,
    val id: Int,
    val mother: String,
    val name: String,
    val profile_pic: String,
    val remark: String,
    val roll_no: String,
    val term1_gpa: String,
    val term2_gpa: String,
    val term_one: List<TermOne>,
    val term_two: List<TermTwo>
)

data class FinalTerm(
    val qta1: String,
    val qta2: String,
    val subject: String,
    val term: String
)

data class TermOne(
    val qta1: String,
    val qta2: String,
    val subject: String,
    val term: String
)

data class TermTwo(
    val qta1: String,
    val qta2: String,
    val subject: String,
    val term: String
)
