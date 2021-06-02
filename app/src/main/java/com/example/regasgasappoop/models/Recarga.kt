package com.example.regasgasappoop.models

import android.widget.Toast

class Recarga(
    val Code:String,
    val Description:String,
    val Duration:String,
    val Price:Int,
    val Title:String,
    val Category:String
) {


    fun introduce():String{
        return "Soy una recarga de $Price mi duraciones $Duration y mi nombre es $Title"
    }
}