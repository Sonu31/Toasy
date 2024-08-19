package com.android.mylibrary

import android.content.Context
import android.widget.Toast

class Toasty {
    fun simpleToast(msg:String,context:Context){
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show()
    }
}