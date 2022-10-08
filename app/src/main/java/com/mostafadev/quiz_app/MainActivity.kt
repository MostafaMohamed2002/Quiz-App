package com.mostafadev.quiz_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        start_btn.setOnClickListener {
            val usernametext=edittext_username.text.toString()
            if(usernametext.isNotEmpty()){
                Toast.makeText(this, usernametext,Toast.LENGTH_SHORT).show()
            }
        }
    }
}