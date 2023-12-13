package com.example.bogotapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bogotapp.R
import com.example.bogotapp.Sitio

class SitiosAdapter ( private val emblematicoList: List<Sitio>) : RecyclerView.Adapter<SitiosViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SitiosViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SitiosViewHolder(layoutInflater.inflate(R.layout.view_sitio,parent,false))
    }

    override fun onBindViewHolder(holder: SitiosViewHolder, position: Int) {
        val item = emblematicoList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = emblematicoList.size

}