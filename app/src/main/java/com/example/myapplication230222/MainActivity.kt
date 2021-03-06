package com.example.myapplication230222

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = "Ivan"
        val surname = "Ivanov"
        val age = 37
        val height = 172.2

        val summary = "name: $name surname: $surname age: $age height: $height"

        val output: TextView =findViewById(R.id.output)
        output.text = summary

        Log.d(TAG, summary)
    }
}