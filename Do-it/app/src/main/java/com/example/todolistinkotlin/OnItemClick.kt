package com.example.todolistinkotlin

import android.view.View


interface OnItemClick {

    fun onItemClick(v: View, position: Int)
}