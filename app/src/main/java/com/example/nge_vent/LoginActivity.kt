package com.example.nge_vent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var btnLogin: Button = findViewById(R.id.button2)

        btnLogin.setOnClickListener {
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)

            Toast.makeText(this, "Selamat, Anda Berhasil Login", Toast.LENGTH_SHORT).show()
        }

        var btnCreate: TextView = findViewById(R.id.text4)

        btnCreate.setOnClickListener {
            val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(intent)

            Toast.makeText(this, "Lakukan Pendaftaran", Toast.LENGTH_SHORT).show()
        }
    }
}