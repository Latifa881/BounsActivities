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
        btRecyclerView.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}