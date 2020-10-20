package com.legion.lekha.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.legion.lekha.R
import com.legion.lekha.adapters.HobbiesAdapter
import com.legion.lekha.modles.Supplier
import kotlinx.android.synthetic.main.activity_hobbies.*

class HobbiesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyview.layoutManager = layoutManager
        val adapter= HobbiesAdapter(this, Supplier.hobbies)
        recyview.adapter = adapter

    }
}
