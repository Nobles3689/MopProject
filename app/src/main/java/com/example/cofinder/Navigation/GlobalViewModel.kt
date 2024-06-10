package com.example.cofinder.Navigation

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.cofinder.Data.UserData

class GlobalViewModel : ViewModel() {
    var userData = UserData("0000")
    var userID:String? = ""
    var userPasswd:String? = ""
    var loginStatus = mutableStateOf( false )

}