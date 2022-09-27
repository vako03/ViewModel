package com.example.mytest

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() { // ცალკე შეიქმნა ვიუმოდელი სადაც ინახევა ინფო
    //var  count= 0//
    var count = MutableLiveData<Int>()

    init {
        count.value=0
    }
    fun updateCount(){  // ფუნქცია რომელიც count-ის მნიშვნელობას ზრდის 1 ით
       // ++count//
        count.value=(count.value)?.plus(1)
    }

}