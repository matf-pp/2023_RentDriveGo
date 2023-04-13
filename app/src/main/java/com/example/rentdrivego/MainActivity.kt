package com.example.rentdrivego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)



        val email = findViewById(R.id.email) as EditText
        val pass = findViewById(R.id.password) as EditText
        val login = findViewById(R.id.login) as Button
        val register = findViewById(R.id.register) as Button

        login.setOnClickListener {
            if(email.toString() == "bosko.a2001@gmail.com" && pass.toString() == "1234"){
                setContentView(R.layout.main_page)
            }else{
                Toast.makeText(applicationContext,"Wrong Email or Password",Toast.LENGTH_SHORT).show()
            }
        }

        register.setOnClickListener{
            setContentView(R.layout.register_page)
            val register2 = findViewById(R.id.register2) as Button
            register2.setOnClickListener {
                setContentView(R.layout.login_page)
            }
        }
    }
}