package com.example.todolistinkotlin

import androidx.room.Entity




class ToDoListData(
    val title: String = "",
    val date: String = "",
    val time: String = "",
    var indexDb: Long = 0,
    val isShow : Int = 0
)