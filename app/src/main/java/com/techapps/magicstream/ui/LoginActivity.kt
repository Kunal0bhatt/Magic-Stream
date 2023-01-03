package com.techapps.magicstream.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.techapps.magicstream.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar!!.hide()


        val btnlogin : TextView = findViewById(R.id.BTNLogin)
        val btnsignin : TextView = findViewById(R.id.BTNSignin)


        btnlogin.setOnClickListener {
            startActivity(Intent(this@LoginActivity,MainActivity::class.java))
        }

        btnsignin.setOnClickListener {
            Toast.makeText(this,"Please contact developer at MagicStream@yopmail.com",Toast.LENGTH_LONG).show()
        }
    }
}