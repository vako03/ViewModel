package com.example.mytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get

class MainActivity : AppCompatActivity() {
    var count = 0 //  1.1 დასაწყისში 0-ის ტოლია
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        //ვიუმოდელიდან რომ წამოვიღოთ ფუნქცია "updateCount()  "და დავუკავშიროთ მონაცემები

        var textView = findViewById<TextView>(R.id.tvCount)
        var button = findViewById<Button>(R.id.btnCount)

        viewModel.count.observe(this,Observer{
            textView.text=it.toString() //ავტომატურად ანახლებს მნიშვნელობას დაკლილებისას
        })

       // textView.text=viewModel.count.toString() //1.2ვიზუალს აჩვენებს რომ არის 0
        button.setOnClickListener { //დაჭერის შემდგე

            viewModel.updateCount() //ვიუმოდელიდან გადმოდის ფუნქცია
         //   textView.text=viewModel.count.toString() //ვიზუალში აჩვენებს გაზრდას

        }



        }
}