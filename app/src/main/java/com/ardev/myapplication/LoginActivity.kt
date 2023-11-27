package com.ardev.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val iconBack: ImageView = findViewById(R.id.imv_back)
        iconBack.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.imv_back -> {
                intent = Intent(this, WelcomeActivity::class.java)
                startActivity(intent)
            }
        }
    }
}