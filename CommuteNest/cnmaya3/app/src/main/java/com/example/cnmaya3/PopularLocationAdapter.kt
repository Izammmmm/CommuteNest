package com.example.cnmaya3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PopularLocationAdapter : RecyclerView.Adapter<PopularLocationAdapter.ViewHolder>() {

    private val locations = listOf("Kuala Lumpur", "Genting Highland")
    private val countries = listOf("Malaysia", "Malaysia")
    private val images = listOf(R.drawable.kuala, R.drawable.genting_highland)

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image = view.findViewById<ImageView>(R.id.placeImage)
        val title = view.findViewById<TextView>(R.id.placeName)
        val country = view.findViewById<TextView>(R.id.placeCountry)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_place, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = locations.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = locations[position]
        holder.country.text = countries[position]
        holder.image.setImageResource(images[position])
    }
}
