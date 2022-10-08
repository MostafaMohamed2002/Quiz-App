package com.mostafadev.quiz_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_quiz_question.*

class QuizQuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)
        val currentPosistion =1
        progress_circle.progress=currentPosistion
        progress_tv.text="$currentPosistion"
        val questionList= getQuestions()
        val question=questionList[currentPosistion-1]
        question_tv.text=question.question
        option_one.text=question.optionOne
        option_two.text=question.optionTwo
        option_three.text=question.optionThree
        option_four.text=question.optionFour
    }
}