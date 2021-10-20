package com.example.recyclerviewactivitybonus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        val btRecyclerView=findViewById<Button>(R.id.btRecyclerView)
        val MultipleActivities=findViewById<Button>(R.id.MultipleActivities)
        val FacebookUi=findViewById<Button>(R.id.FacebookUi)
        FacebookUi.setOnClickListener {
            startActivity(Intent(this,FacebookActivity::class.java))
        }
        btRecyclerView.setOnClickListener {
            startActivity(Intent(this,RecyclerViewActivity1::class.java))
        }
        MultipleActivities.setOnClickListener {
            startActivity(Intent(this,MultipleActivities_SignIn::class.java))
        }
    }
}