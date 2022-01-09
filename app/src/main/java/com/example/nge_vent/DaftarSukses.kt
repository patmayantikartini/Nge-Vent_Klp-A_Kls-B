package com.example.nge_vent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DaftarSukses : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_sukses)

        var btnDashboard : Button = findViewById(R.id.btnDashboard)

        btnDashboard.setOnClickListener {
            val intent = Intent(this@DaftarSukses, MainActivity::class.java)
            startActivity(intent)
        }

    }
}