package com.example.bogotapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bogotapp.adapter.SitiosAdapter

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val screenSplash = installSplashScreen()
        super.onCreate(savedInstanceState)
        Item.emblematicoList
        setContentView(R.layout.activity_menu)
        initReciclerView()
    }

   private fun initReciclerView() {
       val reciclerView = findViewById<RecyclerView>(R.id.recycler)
       reciclerView.layoutManager = LinearLayoutManager(this)
       reciclerView.adapter = SitiosAdapter(Item.emblematicoList)
   }

}
