package com.example.mytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get

class MainActivity : AppCompatActivity() {
    private lateinit var  viewModel: MainActivityViewModel
        var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        val textView =findViewById<TextView>(R.id.tvCount)
        val button = findViewById<Button>(R.id.btnCount)

        textView.text=viewModel.count.toString()
        button.setOnClickListener {
         viewModel.updateCount()
            textView.text =viewModel.count.toString()
        }
    }
}