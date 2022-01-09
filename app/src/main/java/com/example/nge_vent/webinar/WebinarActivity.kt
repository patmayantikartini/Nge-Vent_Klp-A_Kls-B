package com.example.nge_vent.webinar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nge_vent.R
import com.example.nge_vent.webinar.Webinar
import com.example.nge_vent.webinar.WebinarData
import com.example.nge_vent.webinar.DetailActivity2
import com.example.nge_vent.webinar.ListWebinarAdapter

class WebinarActivity : AppCompatActivity() {

    private lateinit var rvHeroesWebinar: RecyclerView
    private var listWebinar: ArrayList<Webinar> = arrayListOf()
    private var title: String = "List Webinar"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webinar)
        setActionBarTitle(title)

        rvHeroesWebinar = findViewById(R.id.rv_heroesWebinar)
        rvHeroesWebinar.setHasFixedSize(true)

        listWebinar.addAll(WebinarData.listDataWebinar)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvHeroesWebinar.layoutManager = LinearLayoutManager(this)
        val listWebinarAdapter = ListWebinarAdapter(listWebinar)
        rvHeroesWebinar.adapter = listWebinarAdapter

        listWebinarAdapter.setOnItemClickCallback(object : ListWebinarAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Webinar) {
                showSelectedHero(data)
            }
        })
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun showSelectedHero(hero: Webinar) {
        val intent = Intent(this@WebinarActivity, DetailActivity2::class.java)
        intent.putExtra(DetailActivity2.EXTRA_NAME,hero.nameWebinar)
        intent.putExtra(DetailActivity2.EXTRA_IMAGE,hero.photoWebinar)
        intent.putExtra(DetailActivity2.EXTRA_DETAIL,hero.detailWebinar)
        startActivity(intent)
    }
}