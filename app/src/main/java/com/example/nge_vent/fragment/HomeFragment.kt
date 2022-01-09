package com.example.nge_vent.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import com.example.nge_vent.*
import com.example.nge_vent.article.ArticleActivity
import com.example.nge_vent.databinding.FragmentHomeBinding
import com.example.nge_vent.webinar.WebinarActivity

class HomeFragment : Fragment () {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val bind = FragmentHomeBinding.inflate(layoutInflater)
        bind.btnArtikel.setOnClickListener{
            val intent = Intent (this@HomeFragment.requireContext(), ArticleActivity::class.java)
            startActivity(intent)
        }

        bind.btnWebinar.setOnClickListener {
            val intent2 = Intent(this@HomeFragment.requireContext(), WebinarActivity::class.java)
            startActivity(intent2)
        }
        // Inflate the layout for this fragment
        return bind.root
    }
}