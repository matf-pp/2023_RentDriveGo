package com.example.rentdrivego

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val arRegister:Button = findViewById(R.id.arRegister)

        val arEmail:EditText = findViewById(R.id.arEmail)
        val arPass:EditText = findViewById(R.id.arPassword)
        val arPassAg:EditText = findViewById(R.id.arPasswordAgain)

        arRegister.setOnClickListener {
            if(arEmail.text.trim().isNotEmpty() && arPass.text.trim().isNotEmpty() && arPassAg.text.trim().isNotEmpty()){
               register()
            }else{
                Toast.makeText(this, "No input", Toast.LENGTH_LONG).show()
            }
        }

    }

    private fun register(){

    }
}