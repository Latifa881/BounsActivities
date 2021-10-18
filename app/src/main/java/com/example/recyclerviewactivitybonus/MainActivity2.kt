package com.example.recyclerviewactivitybonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    lateinit var rvMain: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        rvMain = findViewById(R.id.rvMain)
       val name= intent.getStringExtra("Name")
        val location= intent.getStringExtra("Location")
        val phone= intent.getStringExtra("Phone")
        val email= intent.getStringExtra("Email")


        rvMain.adapter = RecyclerViewAdapter(GlobalConstants.detailsArray)
        rvMain.layoutManager = LinearLayoutManager(this)
        GlobalConstants.detailsArray.add(MainActivity2.details(name!!,location!!,phone!!,email!!))
        rvMain.adapter!!.notifyDataSetChanged()
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Recycler View Activity(Details)"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
    public data class details(val name:String,val location:String,val phone:String,val email:String)
}