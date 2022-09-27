package com.example.mytest

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() { // ცალკე შეიქმნა ვიუმოდელი სადაც ინახევა ინფო
    var  count= 0

    fun updateCount(){  // ფუნქცია რომელიც count-ის მნიშვნელობას ზრდის 1 ით
        ++count
    }

}