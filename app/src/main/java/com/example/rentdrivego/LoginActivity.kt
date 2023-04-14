package com.example.rentdrivego

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val alLogin:Button = findViewById(R.id.alLogin)

        val amEmail:EditText = findViewById(R.id.alEmail)
        val amPass:EditText = findViewById(R.id.alPassword)

        alLogin.setOnClickListener {
            if(amEmail.text.trim().isNotEmpty() && amPass.text.trim().isNotEmpty()){
                login()
            }else{
                Toast.makeText(this, "No input", Toast.LENGTH_LONG).show()
            }
        }

    }

    private fun login(){

    }
}