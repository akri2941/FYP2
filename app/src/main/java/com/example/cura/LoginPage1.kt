package com.example.cura

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class LoginPage1 : AppCompatActivity() {
    lateinit var LoginButton: Button
    lateinit var Loginemail: EditText
    lateinit var Loginpassword: EditText
    var valEmail = "abc@gmail.com"
    var valPassword = "Potato@234"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page1)

        LoginButton = findViewById(R.id.Login_login_btn)
        Loginemail = findViewById(R.id.Login_email)
        Loginpassword= findViewById(R.id.Login_password)



        LoginButton.setOnClickListener {
            if (Loginemail.text.toString().isEmpty()){
                Toast.makeText(applicationContext, "Please enter email address", Toast.LENGTH_SHORT).show()
            }
            else{
                if (Loginpassword.text.toString().isEmpty()){
                    Toast.makeText(applicationContext, "Please enter password", Toast.LENGTH_SHORT).show()
                }
                else{

                }
            }
        }
    }

}
