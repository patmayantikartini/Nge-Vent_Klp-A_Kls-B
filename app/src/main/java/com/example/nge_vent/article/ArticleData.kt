package com.example.nge_vent.article

import com.example.nge_vent.R

object ArticleData {

        private val heroJudul = arrayOf(
            "Kegiatan di Rumah Aja yang Dapat Tingkatkan Skill Kamu",
            "Tingkatkan Soft Skill Mahasiswa Untuk Hadapi Dunia Kerja",
            "Tips Tingkatkan Skill Kerja dengan Cepat Agar Sukses Bersaing"
        )

        private val heroDetails = arrayOf(
            "1.  Menulis\n" +
                    "Menulis bisa memberi manfaat ekonomis maupun sebagai terapi. Menulis di diary, bullet journal, esai, atau blog merupakan salah satu cara agar otak tetap tajam dan berpikir kritis. Tak perlu harus menjadi penulis yang menerbitkan buku. Hanya dengan rutin ngeblog dengan konten yang kamu sukai bisa memberi manfaat untuk pembaca dari mana saja. Bahkan menulis bisa menjadi ladang pemasukan dengan memonetisasi blogmu, apalagi jika kamu expert di bidangmu. Jika situsmu ramai, kamu bisa menarik perhatian advertiser untuk kerja sama. Menarik, bukan?\n" +
                    "\n" +
                    "2.  Mempelajari Bahasa Asing\n" +
                    "Belajar bahasa baru semakin marak di masa berdiam diri di rumah. Belajar bahasa kini bisa dilakukan dengan kelas virtual lewat video streaming. Batasan waktu dan jarak bisa diatasi dengan bertemu secara LIVE bersama para native speaker dari mancanegara. Selain lewat video streaming, belajar bahasa makin mudah dengan aplikasi belajar bahasa asing yang tersedia di playstore. Berbagai aplikasi tersedia gratis maupun berbayar. Selain itu grup atau komunitas online language exchange partner bisa menjadi solusi untuk tandem partner berbahasa. Kamu bisa memilih untuk chatting via email, apps messenger, voice note/call, video call, atau penpal dengan surat plus perangko!\n" +
                    "\n" +
                    "3.  Public Speaking\n" +
                    "Jika kamu suka dunia public speaking, cobalah melakukan presentasi hasil idemu dengan rekan kerja, atau jadilah moderator untuk streaming diskusi publik via zoom atau podcast. Cobalah dengan percaya diri kamu tunjukkan kemampuanmu mengolah kata dan berkomunikasi di depan orang lain. Kecakapanmu berbicara akan semakin terasah jika kamu berani mencoba tampil di depan publik meski secara virtual.\n",

            "Pusat Kajian Keterampilan Akademik Mahasiswa Dan Karir Alumni menyelenggarakan pelatihan penulisan daftar riwayat hidup atau curriculum vitae (CV) dan pembekalan soft skill untuk menghadapi dunia kerja, selasa (14/9) secara virtual melalui zoom meeting dengan diikuti lebih dari 300 peserta baik dari kalangan mahasiswa maupun alumni dan masyarakat umum.\n" +
                    "\n" +
                    "Kegiatan pelatihan ini dibuka langsung oleh Wakil Rektor bidang Kerjasama dan Kemahasiswaan Dr. Bahrul Ulum, MA. Ia mengapreasi dan mendukung program kegiatan pelatihan yang dilaksanakan pusat kajian. Dengan adanya pelatihan ini ia berharap dapat membantu mahasiswa mengenali dan mengembangkan kemampuan diri yang nantinya dapat dituangkan dalam CV.\n" +
                    "\n" +
                    "Keterampilan hard skill dapat diperoleh dalam bangku pendidikan seperti penguasaan ilmu pengetahuan, teknologi, dan keterampialn teknis. Sedangkan soft skill adalah keterampilan seseorang dalam berhubungan dengan orang lain dan keterampilan dalam mengatur diri sendiri. Soft skill bersifat kepribadian yang menentukan untuk diterima atau tidaknya kita bekerja dimanapun seperti disiplin, integritas, kejujuran, kepemimpinan dan lainnya. Soft skill ini harus diasah dan dilatih karena keterampilan ini penting dalam menentukan karir dalam hidup kita”ucapnya.\n" +
                    "\n" +
                    "Ketua Pusat Kajian Keterampilan Akademik Mahasiswa Dan Karir Alumni Nurlia Fusfita, SE., M.Ec.Dev selaku ketua panitia dalam laporannya menyampaikan kegiatan ini bertujuan untuk menambah wawasan para mahasiswa untuk mempersiapkan diri dalam menghadapi dunia kerja ketika sudah menyelesaikan perkuliahannya di kampus. Awalnya, kegiatan ini ditujukan hanya untuk mahasiswa semester akhir dan alumni namun karena antusias yang tinggi kegiatan ini juga diikuti dapat mahasiswa semester lainnya.\n" +
                    "\n" +
                    "Menghadirkan narasumber Yanri Ramdhano, M.Ed alumni UIN Sulthan Thaha Saifuddin Jambi yang juga merupakan alumni Victoria University Australia yang memiliki banyak pengalaman yang dibagikan dan untuk memotivasi mahasiswa dan alumni untuk dapat bersaing dalam dunia kerja dengan meningkatkan skill yang dimiliki.\n"+
                    "\n" +
                    "Dengan adanya pelatihan ini diharapkan dapat memberikan wawasan baru bagi mahasiswa untuk mulai membuat membuat CV-nya  agar dapat nanti memiliki persiapan yang lebih baik dalam menghadapi dunia kerja khususnya soft skill.",

            "Cakap berkomunikasi\n" +
                    "Dengan berkomunikasi yang baik berarti kamu mampu mengutarakan ide dan pikiran dengan kata-kata, intonasi, serta bahasa tubuh yang tepat, dengan begitu perusahaan akan memberikan penilaian lebih untuk kamu.\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Melek digital\n" +
                    "Banyak pekerjaan yang menuntut kemampuan kamu mengoperasikan berbagai software maupun aplikasi untuk mendukung kinerja kamu di perusahaan, itu akan menjadi nilai lebih dari perusahaan jika kamu tidak hanya sekedar “bisa” mengoperasikannya, namun “mahir” dan “menguasai”.\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Etos kerja\n" +
                    "Di balik semua skill yang kamu punya, etos kerja juga sangat penting untuk dibangun. Memiliki etos kerja yang baik akan menunjukkkan bahwa kamu adalah pekerja yang ideal, memiliki orientasi ke depan, menghargai waktu, bertanggung jawab, dan memiliki persaingan yang sehat."
        )

        private val heroesImages = intArrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c
        )

    val listData: ArrayList<Article>
        get() {
            val list = arrayListOf<Article>()
            for (position in heroJudul.indices) {
                val hero = Article()
                hero.name = heroJudul[position]
                hero.detail = heroDetails[position]
                hero.photo = heroesImages[position]
                list.add(hero)
            }
            return list
        }
}