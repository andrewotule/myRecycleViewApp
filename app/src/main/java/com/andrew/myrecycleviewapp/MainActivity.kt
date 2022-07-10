package com.andrew.myrecycleviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recylcerv = findViewById<RecyclerView>(R.id.recyc_view)
        recylcerv.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<ItemsViewModel>()
        for (i in 1..20) {
            data.add(ItemsViewModel(R.drawable.ic_baseline_person_24, "item" + i))
        }

        // This will pass the ArrayList to our Adapter
        val adapter = customAdapter(data)

        // Setting the Adapter with the recyclerview
        recylcerv.adapter = adapter

    }
}