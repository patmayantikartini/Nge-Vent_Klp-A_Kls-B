package com.example.nge_vent.article

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nge_vent.R

class ArticleActivity : AppCompatActivity() {

    private lateinit var rvHeroes: RecyclerView
    private var list: ArrayList<Article> = arrayListOf()
    private var title: String = "List Article"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article)
        setActionBarTitle(title)

        rvHeroes = findViewById(R.id.rv_heroes)
        rvHeroes.setHasFixedSize(true)

        list.addAll(ArticleData.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvHeroes.layoutManager = LinearLayoutManager(this)
        val listArticleAdapter = ListArticleAdapter(list)
        rvHeroes.adapter = listArticleAdapter

        listArticleAdapter.setOnItemClickCallback(object : ListArticleAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Article) {
                showSelectedHero(data)
            }
        })
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun showSelectedHero(hero: Article) {
        val intent = Intent(this@ArticleActivity, DetailActivity::class.java)
        intent.putExtra(DetailActivity.EXTRA_NAME,hero.name)
        intent.putExtra(DetailActivity.EXTRA_IMAGE,hero.photo)
        intent.putExtra(DetailActivity.EXTRA_DETAIL,hero.detail)
        startActivity(intent)
    }
}