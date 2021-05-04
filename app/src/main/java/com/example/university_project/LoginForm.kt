package com.example.university_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_login_form.*

//Activity
class LoginForm : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_form)

        rebtn.setOnClickListener{
            val intent = Intent(this, RegisterForm::class.java)
            startActivity(intent)
        }
        fgBtn.setOnClickListener{
            val intent = Intent(this,ForGotPassword::class.java)
            startActivity(intent)
        }

    }
}