package com.example.nge_vent.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.nge_vent.R
import com.example.nge_vent.WelcomeActivity
import com.example.nge_vent.databinding.FragmentProfilBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ProfilFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProfilFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val bind = FragmentProfilBinding.inflate(layoutInflater)
        bind.btnlogout.setOnClickListener {
            val intent = Intent(this@ProfilFragment.requireContext(), WelcomeActivity::class.java)
            startActivity(intent)

            Toast.makeText(activity, "Kembali Ke Halaman Awal", Toast.LENGTH_SHORT).show()
        }
        // Inflate the layout for this fragment
        return bind.root
    }
}