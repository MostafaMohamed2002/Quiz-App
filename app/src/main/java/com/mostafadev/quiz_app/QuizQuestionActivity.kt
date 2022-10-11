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

    //Global variables
    private var gCurrentPosition:Int=1
    //we assign it in this point we will assign it in onCreat method
    private var gQuestionList:ArrayList<Question>?=null
    //we need to know which option was selected
    private var gSelectedOptionPosition:Int?=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)
        gQuestionList= getQuestions()
        setQuestion()

    }

    private fun setQuestion() {

        gCurrentPosition =1

        val question=gQuestionList!![gCurrentPosition-1]
        progress_circle.progress=gCurrentPosition
        progress_tv.text="$gCurrentPosition"
        question_tv.text=question.question
        option_one.text=question.optionOne
        option_two.text=question.optionTwo
        option_three.text=question.optionThree
        option_four.text=question.optionFour

        if (gCurrentPosition == gQuestionList!!.size){
            submit_btn.text="Finish"

        }else{
            submit_btn.text="Submit"
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {

            R.id.option_one -> {
                option_one?.let {
                    selectedOptionView(it, 1)
                }

            }

            R.id.option_two -> {
                option_two?.let {
                    selectedOptionView(it, 2)
                }

            }

            R.id.option_three -> {
                option_three?.let {
                    selectedOptionView(it, 3)
                }

            }

            R.id.option_four -> {
                option_four?.let {
                    selectedOptionView(it, 4)
                }

            }
            R.id.submit_btn -> {
                TODO()
            }
        }

    }
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

//            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this@QuizQuestionActivity,
               R.drawable.default_option_border_bg
            )
        }
    }
    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {

        defaultOptionsView()

        gSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(
            Color.parseColor("#363A43")
        )
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this@QuizQuestionActivity,
            R.drawable.selected_option_border_bg
        )
    }
}