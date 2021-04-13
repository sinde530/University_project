package com.example.university_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun btn(view: View) {
        val nextIntent = Intent(this, LoginForm ::class.java)
        startActivity(nextIntent)
    }
}