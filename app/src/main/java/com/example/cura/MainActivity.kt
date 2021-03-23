package com.example.cura

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    Login.setOnClickListener {
        val intent = Intent(this, LoginPage1::class.java)
        startActivity(intent)
    }

    SignUp.setOnClickListener {
        val intent= Intent(this, SignUpMain::class.java)
        startActivity(intent)
    }

    }




}