package com.example.nge_vent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var btnLogin: Button = findViewById(R.id.btnregist)

        btnLogin.setOnClickListener {
            val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Selamat, Anda Berhasil Daftar", Toast.LENGTH_SHORT).show()
        }

        var btnCreate: TextView = findViewById(R.id.text4)

        btnCreate.setOnClickListener {
            val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Kembali ke Halaman Login", Toast.LENGTH_SHORT).show()

        }
    }
}