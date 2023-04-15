package com.example.rentdrivego

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val amLogin:Button = findViewById(R.id.amLogin)
        val amRegister:Button = findViewById(R.id.amRegister)

        //Ako se pritisne dugme za prijavljivanje(Salje se na sledecu stranu LoginActivity):
        amLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        //Ako se pritisne dugme za registraciju(Salje se na sledecu stranu RegisterActivity):
        amRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }

}