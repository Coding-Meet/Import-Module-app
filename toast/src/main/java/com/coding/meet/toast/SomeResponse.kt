package com.coding.meet.toast

import android.content.Context

class SomeResponse(private val context: Context) {
    fun getChannelName(){
        longToastShow(context,"Coding Meet")
    }
}