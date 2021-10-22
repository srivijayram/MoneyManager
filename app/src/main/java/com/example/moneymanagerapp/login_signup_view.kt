package com.example.moneymanagerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class login_signup_view : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_signup_view)
    }
    fun sendMessage1(view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity( intent )
    }
    fun sendMessage(view: View) {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity( intent )
    }
}