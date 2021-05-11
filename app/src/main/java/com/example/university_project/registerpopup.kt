package com.example.university_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import kotlinx.android.synthetic.main.activity_login_form.*
import kotlinx.android.synthetic.main.activity_registerpopup.*

class registerpopup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registerpopup)




        CleBtn.setOnClickListener(){
            var myIntent = Intent (this,LoginForm::class.java)
            startActivity(myIntent)
        }
    }



    fun mOnClose(view: View) {

    }


}