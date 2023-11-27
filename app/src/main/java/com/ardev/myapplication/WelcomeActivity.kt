package com.ardev.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class WelcomeActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val btnLogin: Button = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
}