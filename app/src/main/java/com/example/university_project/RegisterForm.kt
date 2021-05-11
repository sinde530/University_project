package com.example.university_project

import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_register_form.*

class RegisterForm : AppCompatActivity() {

    val DB_NAME = "sqlite.sql"
    val DB_VERSION = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_form)

//        val helper = DBHelper(this, DB_NAME, DB_VERSION )

//        val memo = Memo(1, "내용", 1231545123)



         var sData = resources.getStringArray(R.array.my_arry)
        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, sData)
        spinner.adapter = adapter

        RegisterCle.setOnClickListener(){
            val myIntent = Intent(this,registerpopup::class.java)
            startActivity(myIntent)
        }



        BackBtn.setOnClickListener(){
            finish()
        }

    }

}