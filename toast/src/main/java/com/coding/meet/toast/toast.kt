package com.coding.meet.toast

import android.content.Context
import android.widget.Toast


fun longToastShow(context:Context,msg:String){
    Toast.makeText(context,msg,Toast.LENGTH_LONG).show()
}