package com.example.university_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_side_bar.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        open_menu_btn.setOnClickListener {
            main_side_layout.openDrawer((GravityCompat.START))
        }


        main_navigation_btn1.setOnClickListener {
            //버튼1 클릭 시
        }

        main_navigation_btn2.setOnClickListener {
            //버튼2 클릭 시
        }
    }


}