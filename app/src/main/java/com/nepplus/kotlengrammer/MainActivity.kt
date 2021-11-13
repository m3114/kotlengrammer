package com.nepplus.kotlengrammer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnVariable01.setOnClickListener {
//            이안에적은코드 변수문법연수01
            var myName : String
            myName = "윤성노"
            myName = "김겅진"

            Log.d("문법연습01",myName)

            val friendName : String
            friendName = "김갑성"
//            friendName = "김친구"
            Log.d("문법연습01",friendName)



        }

        btnVariable02.setOnClickListener {
//            변수연습2

            var myName = "윤성노"
            val myBrithYear = 1974
            var myheight = 174.5

            myheight = 190

            Log.d("변수연습02", myName)
        }


    }
}