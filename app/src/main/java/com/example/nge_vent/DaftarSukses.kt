package com.example.nge_vent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class DaftarSukses : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_sukses)

        var dashboard: Button = findViewById(R.id.btnDashboard)

        dashboard.setOnClickListener {
            val intent = Intent(this@DaftarSukses, MainActivity::class.java)
            startActivity(intent)

            Toast.makeText(this, "Kembali ke Dashboard", Toast.LENGTH_SHORT).show()
        }
    }
}