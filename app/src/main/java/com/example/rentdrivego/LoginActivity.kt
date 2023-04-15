package com.example.rentdrivego

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class LoginActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth = Firebase.auth

        val alLogin:Button = findViewById(R.id.alLogin)

        val amEmail:EditText = findViewById(R.id.alEmail)
        val amPass:EditText = findViewById(R.id.alPassword)

        //Pritiskom na dugme Login zapocinje se proces prijavljivanja:
        alLogin.setOnClickListener {
            if(amEmail.text.trim().isNotEmpty() && amPass.text.trim().isNotEmpty()){
                login()
            }else{
                Toast.makeText(this, "No input", Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun login(){
        val amEmail:EditText = findViewById(R.id.alEmail)
        val amPass:EditText = findViewById(R.id.alPassword)

        //Prijavljivanje i obrada da li je uspela ili ne, ako jeste ucitavamo sledecu stranu, ako nije izbacujemo gresku korisniku
        auth.signInWithEmailAndPassword(amEmail.text.trim().toString(),amPass.text.trim().toString()).addOnCompleteListener(this) {
            login ->
            if(login.isSuccessful){
                val intent = Intent(this,DashboardActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this,"Authentication error " + login.exception, Toast.LENGTH_LONG).show()
            }
        }
    }

}