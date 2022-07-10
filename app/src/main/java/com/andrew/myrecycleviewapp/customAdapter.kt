package com.andrew.myrecycleviewapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class customAdapter(private val mlist:List<ItemsViewModel>): RecyclerView.Adapter<customAdapter.ViewHolder>() {
    //oncreateViewHolder():this function sets the views to display the
    //create views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): customAdapter.ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)
        return ViewHolder(view)
        //inflates the cardview
        //that is used to hold lots of items
    }

    //binds the list of items to the view
    override fun onBindViewHolder(holder: customAdapter.ViewHolder, position: Int) {
        val ItemsViewModel = mlist[position]
        holder.imageview.setImageResource(ItemsViewModel.image)
        holder.textview.text = ItemsViewModel.text
    }

    override fun getItemCount(): Int {
        return mlist.size
    }

    class ViewHolder(ItemView: View) :RecyclerView.ViewHolder(ItemView){
        val imageview: ImageView = ItemView.findViewById(R.id.imgview)
        val textview: TextView = ItemView.findViewById(R.id.text1)
    }

}