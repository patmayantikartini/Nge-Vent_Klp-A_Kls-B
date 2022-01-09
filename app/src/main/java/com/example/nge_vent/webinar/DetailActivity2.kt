package com.example.nge_vent.webinar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.nge_vent.DaftarWebinar
import com.example.nge_vent.R


class DetailActivity2 : AppCompatActivity() {

    private var title: String = "Detail"

    companion object {
        const val EXTRA_NAME = "extra nama"
        const val EXTRA_IMAGE = "extra image"
        const val EXTRA_DETAIL = "extra detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail2)
        setActionBarTitle(title)

        val judul: TextView = findViewById(R.id.judulWebinar)
        val img_detail: ImageView = findViewById(R.id.img_detailWebinar)
        val detail_deskripsi: TextView = findViewById(R.id.detail_deskripsiWebinar)


        val nama = intent.getStringExtra(EXTRA_NAME)
        val image = intent.getIntExtra(EXTRA_IMAGE, 0)
        val detail = intent.getStringExtra(EXTRA_DETAIL)

        Glide.with(this)
            .load(image)
            .apply(RequestOptions().override(100, 50))
            .into(img_detail)
        judul.text = nama
        detail_deskripsi.text = detail

        var btnWebinar: Button = findViewById(R.id.btnbookingwebinar)

        btnWebinar.setOnClickListener {
            val intent = Intent(this@DetailActivity2, DaftarWebinar::class.java)
            startActivity(intent)
        }
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}


