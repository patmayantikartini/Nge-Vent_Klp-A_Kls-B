package com.example.nge_vent.webinar

import com.example.nge_vent.R
import com.example.nge_vent.webinar.Webinar
import com.example.nge_vent.webinar.WebinarData

object WebinarData {

        private val webinarJudul = arrayOf(
            "Webinar GRATIS Affiliate Marketing",
            "BolehNgobrol: Digital Marketing in Tourism Industry",
            "Data Protection for Business"
        )

        private val webinarDetails = arrayOf(
            "Apakah Anda Bisa Melihat Perubahan yang Terjadi Sekarang Ini Di Sekitar Anda?\n" +
                    "\n" +
                    "Banyak sekali bisnis - bisnis yang mulai tumbang dan PHK yang semakin menakutkan. Semoga hal ini tidak terjadi dengan Anda.\n" +
                    "\n" +
                    "Namun tetap saja Anda harus punya persiapan Apa yang sudah Anda persiapkan untuk menghadapi semua ini?\n" +
                    "\n" +
                    "Sudahkah Anda memiliki bisnis yang anti krisis?\n" +
                    "\n" +
                    "..atau sebaliknya Anda belum tau harus melakukan bisnis apa?\n" +
                    "\n" +
                    "Jika Anda termasuk yang masih bingung saya ingin mengundang Anda untuk ikut dalam sebuah Webinar yang akan membahas 3 Rahasia :\n" +
                    "\n" +
                    "- Rahasia#1.\n" +
                    "\n" +
                    "Temukan 3 Langkah Sederhana memiliki Bisnis Ideal di era New Normal\n" +
                    "\n" +
                    "- Rahasia#2.\n" +
                    "\n" +
                    "Miliki 4 Persyaratan Terpenting Supaya Bisnis Anda kebal Krisis\n" +
                    "\n" +
                    "- Rahasia#3.\n" +
                    "\n" +
                    "Rahasia Top Internet marketer Dunia yang sudah proven dan bisa Anda Duplikasi Polanya.\n" +
                    "\n" +
                    " Webinar ini seharusnya senilai Rp.300rb Namun Anda masih punya kesempatan untuk ikut webinar ini GRATIS selama masih tersedia.\n" +
                    "\n" +
                    "Maka dari itu untuk Anda yang memang MAU IKUT silakan langsung daftar saja sebelum pendaftaran ditutup.",
            "Udah hampir 2 tahun kita lewatin masa pandemi. Banyak juga sektor industri yang udah mulai bangkit untuk bertahan. Tapi gimana kabarnya dengan industri pariwisata di Indonesia saat ini? Upaya apa aja sih yang mereka lakuin untuk tetap bertahan di kondisi sulit ini? \n" +
                    "\n" +
                    "Yuk cari tau jawabannya lewat BolehNgobrol! ",
            "Setiap perusahaan, startup hingga enterprise besar, memiliki data yang penting terkait bisnisnya. Data protection bisa melindungi informasi pribadi karyawan, pelanggan dan hak Kekayaan Intelektual Perusahaan. Dengan ini, informasi sensitif, brand integrity dan produktivitas bisnis terjaga dari spyware ataupun cybersecurity attack.\n" +
                    "\n" +
                    "Yuk, jelajahi manfaatnya Data Protection dan pelajari strategi yang tepat untuk menjaga keamanan data perusahaan kamu.\n" +
                    "\n" +
                    "Daftar sekarang!"
        )

        private val webinarImages = intArrayOf(
            R.drawable.d,
            R.drawable.e,
            R.drawable.f
        )

        val listDataWebinar: ArrayList<Webinar>
            get() {
                val list = arrayListOf<Webinar>()
                for (position in WebinarData.webinarJudul.indices) {
                    val hero = Webinar()
                    hero.nameWebinar = WebinarData.webinarJudul[position]
                    hero.detailWebinar = WebinarData.webinarDetails[position]
                    hero.photoWebinar = WebinarData.webinarImages[position]
                    list.add(hero)
                }
                return list
            }
    }
