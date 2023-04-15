package com.example.rentdrivego

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState : Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val adText: TextView = findViewById(R.id.adText)
        val adLogout: Button = findViewById(R.id.adLogout)

        val user = Firebase.auth.currentUser
        if (user != null) {
            adText.text = user.displayName
        }

        //Dugme za odjavljivanje:
        adLogout.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}