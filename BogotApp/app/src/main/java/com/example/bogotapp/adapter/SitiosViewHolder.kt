package com.example.bogotapp.adapter

import android.net.Uri
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bogotapp.R
import com.example.bogotapp.Sitio


class SitiosViewHolder(view:View):RecyclerView.ViewHolder(view){

    val tituloName = view.findViewById<TextView>(R.id.tituloname)
    val descname = view.findViewById<TextView>(R.id.descname)
    val sitiosImage = view.findViewById<ImageView>(R.id.sitios)

    fun render(sitioModel: Sitio){
        val res = Uri.parse("android.resource://com.example.bogotapp/drawable/" + sitioModel.foto)
        tituloName.text = sitioModel.nombre
        descname.text = sitioModel.desc
        sitiosImage.setImageURI(res)
    }
}
