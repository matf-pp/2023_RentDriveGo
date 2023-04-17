package com.example.rentdrivego

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserProfileChangeRequest
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class RegisterActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        auth = Firebase.auth

        val arRegister:Button = findViewById(R.id.arRegister)

        val arEmail:EditText = findViewById(R.id.arEmail)
        val arPass:EditText = findViewById(R.id.arPassword)
        val arPassAg:EditText = findViewById(R.id.arPasswordAgain)
        val arName:EditText = findViewById(R.id.arName)
        val arSurname:EditText = findViewById(R.id.arSurname)
        val arPhone:EditText = findViewById(R.id.arPhone)

        //Pritiskom na dugme Register zapocinje se proces registracije:
        arRegister.setOnClickListener {
            if(arEmail.text.trim().isNotEmpty() && arPass.text.trim().isNotEmpty() && arPassAg.text.trim().isNotEmpty() &&
                arName.text.trim().isNotEmpty() && arPhone.text.trim().isNotEmpty() && arSurname.text.trim().isNotEmpty()){
               register()
            }else{
                Toast.makeText(this, "No input", Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun register(){
        val arEmail:EditText = findViewById(R.id.arEmail)
        val arPass:EditText = findViewById(R.id.arPassword)
        val arPassAg:EditText = findViewById(R.id.arPasswordAgain)
        val arName:EditText = findViewById(R.id.arName)
        val arSurname:EditText = findViewById(R.id.arSurname)
        val arPhone:EditText = findViewById(R.id.arPhone)

        if(arPass.text.trim().toString() != arPassAg.text.trim().toString()){
            Toast.makeText(this,"Passwords don't match", Toast.LENGTH_SHORT).show()
        }else{
            //Registrovanje i obrada da li je uspela ili ne, ako jeste ucitavamo sledecu stranu, ako nije izbacujemo gresku korisniku
            auth.createUserWithEmailAndPassword(arEmail.text.trim().toString(), arPass.text.trim().toString()).addOnCompleteListener(this) {
                    register ->
                    if (register.isSuccessful) {

                        val currentUser = FirebaseAuth.getInstance().currentUser
                        val profileUpdates = UserProfileChangeRequest.Builder().setDisplayName(arName.text.trim().toString()).build()
                        currentUser?.updateProfile(profileUpdates)

                        val user = User(
                            currentUser!!.uid,arName.text.trim().toString() + arSurname.text.trim().toString(),
                            arPhone.text.trim() as String,arEmail.text.trim().toString())
                        val data = UploadDownload()
                        data.writeUser(user)

                        val intent = Intent(this,DashboardActivity::class.java)
                        startActivity(intent)

                    } else {
                        Toast.makeText(baseContext, "Authentication failed " + register.exception, Toast.LENGTH_LONG).show()
                    }
                }
        }
    }
}