package com.example.nge_vent


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DaftarWebinarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_webinar)

        var daftarwebinar: Button = findViewById(R.id.buttondaftarwebinar)

        daftarwebinar.setOnClickListener {
            val intent = Intent(this@DaftarWebinarActivity, DaftarSukses::class.java)
            startActivity(intent)
        }

    }
}