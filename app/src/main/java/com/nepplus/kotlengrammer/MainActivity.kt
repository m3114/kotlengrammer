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



            Log.d("변수연습02", myName)
        }

        btnCondition01.setOnClickListener {
//            조건문 번튼 눌리면면 실횅 코드
            val userAge = 10
//            나이가 이상인가요> 로그로 성인입니다. 문장 출력
            if(userAge >=20 ){

                Log.d("조건문01","성인입니다.")

            }
            else if(userAge >= 17){
                Log.d("조건문01", "고등학생입니다.")
            }
            else if(userAge >= 14){
                Log.d("조건문01", "중학생입니다.")
            }
            else{
                Log.d("조건문01", "초등학생이거나, 미취학생입니다.")
            }
       }


    }
}