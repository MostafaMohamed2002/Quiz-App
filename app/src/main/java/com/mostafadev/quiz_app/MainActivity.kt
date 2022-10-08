package com.mostafadev.quiz_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val questionList= getQuestions()
        Log.i("Main Activity",questionList.toString())
        Log.i("Main Activity", questionList.size.toString())
        start_btn.setOnClickListener {
            val usernametext=edittext_username.text.toString()
            if(usernametext.isNotEmpty()){
                Toast.makeText(this, usernametext,Toast.LENGTH_SHORT).show()
                val quizQuestionActivity=Intent(this@MainActivity,QuizQuestionActivity::class.java)
                startActivity(quizQuestionActivity)
                    finish()
            }else{
                Toast.makeText(this, "Please enter your name",Toast.LENGTH_SHORT).show()

            }
        }
    }
}