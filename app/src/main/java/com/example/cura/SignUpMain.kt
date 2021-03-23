package com.example.cura

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUpMain : AppCompatActivity() {
    lateinit var SignUpUsername: EditText
    lateinit var SignUpEmail: EditText
    lateinit var SignUpPassword: EditText
    lateinit var SignUpButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_main)

        SignUpUsername = findViewById(R.id.SignUp_Username)
        SignUpEmail = findViewById(R.id.SignUp_Email)
        SignUpPassword = findViewById(R.id.SignUp_Password)
        SignUpButton = findViewById(R.id.SignUp_Button)

        var helper = SignUpDatabase(applicationContext)
        var db= helper.readableDatabase
        var rs = db.rawQuery("SELECT * FROM SignUpdb", null)

        if(rs.moveToNext()){
            Toast.makeText(applicationContext, rs.getString(1), Toast.LENGTH_LONG).show()
        }

        SignUpButton.setOnClickListener {
            if (SignUpUsername.text.toString().isEmpty()){
                Toast.makeText(applicationContext, "Please enter username", Toast.LENGTH_SHORT).show()
            }
            else{
                if (SignUpEmail.text.toString().isEmpty()){
                    Toast.makeText(applicationContext, "Please enter the email", Toast.LENGTH_SHORT).show()
                }
                else{
                    if (SignUpPassword.text.toString().isEmpty()){
                        Toast.makeText(applicationContext, "Please enter the Password", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            var cv = ContentValues()
            cv.put("SignUpUsername", String())
            cv.put("SignUpEmail", String())
            cv.put("SignUpPassword", String())
            db.insert("SignUpdb", null,cv)

            Toast.makeText(applicationContext, "Welcome to CURA family", Toast.LENGTH_SHORT).show()

            SignUpEmail.setText("")
            SignUpUsername.setText("")
            SignUpPassword.setText("")


        }
    }


}