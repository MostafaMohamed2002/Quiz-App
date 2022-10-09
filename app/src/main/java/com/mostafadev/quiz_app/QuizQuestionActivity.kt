package com.mostafadev.quiz_app

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_question.*

class QuizQuestionActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)
        setQuestion()

    }

    private fun setQuestion() {
        val questionList= getQuestions()
        val currentPosistion =10

        val question=questionList[currentPosistion-1]
        progress_circle.progress=currentPosistion
        progress_tv.text="$currentPosistion"
        question_tv.text=question.question
        option_one.text=question.optionOne
        option_two.text=question.optionTwo
        option_three.text=question.optionThree
        option_four.text=question.optionFour

        if (currentPosistion == questionList.size){
            submit_btn.text="Finish"

        }else{
            submit_btn.text="Submit"
        }
    }

    override fun onClick(v: View?) {
        defaultOptionsView()    }
    private fun defaultOptionsView() {

        val options = ArrayList<TextView>()
        option_one?.let {
            options.add(0, it)
        }
        option_two?.let {
            options.add(1, it)
        }
        option_three?.let {
            options.add(2, it)
        }
        option_four?.let {
            options.add(3,it)
        }

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this@QuizQuestionActivity,
                R.drawable.default_option_border_bg
            )
        }
    }
}