package com.example.nge_vent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class WelcomeActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val btnLogin: Button = findViewById(R.id.btnlogin)
        btnLogin.setOnClickListener(this)

        val btnRegist: Button = findViewById(R.id.btnregist)
        btnRegist.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnlogin -> {
                val moveIntent = Intent(this@WelcomeActivity, LoginActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btnregist -> {
                val moveIntent = Intent(this@WelcomeActivity, RegisterActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}