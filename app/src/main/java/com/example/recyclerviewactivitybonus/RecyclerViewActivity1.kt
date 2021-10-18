package com.example.recyclerviewactivitybonus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.text.TextUtils
import android.util.Patterns


class RecyclerViewActivity1 : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var etLocation: EditText
    lateinit var etPhone: EditText
    lateinit var etEmail: EditText
    lateinit var btSubmit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName = findViewById(R.id.etName)
        etLocation = findViewById(R.id.etLocation)
        etPhone = findViewById(R.id.etPhone)
        etEmail = findViewById(R.id.etEmail)
        btSubmit = findViewById(R.id.btSubmit)

        btSubmit.setOnClickListener {
            val name = etName.text.toString()
            val location = etLocation.text.toString()
            val phone = etPhone.text.toString()
            val email = etEmail.text.toString()
            if (name.isNotEmpty() && location.isNotEmpty() && phone.isNotEmpty() && email.isNotEmpty()) {
                if (isValidEmail(email)) {
                    val intent = Intent(this, RecyclerViewActivity2::class.java)
                    intent.putExtra("Name", name)
                    intent.putExtra("Location", location)
                    intent.putExtra("Phone", phone)
                    intent.putExtra("Email", email)
                    etName.setText("")
                    etLocation.setText("")
                    etPhone.setText("")
                    etEmail.setText("")
                    startActivity(intent)
                }else{

                    Toast.makeText(this, "Enter a valid email", Toast.LENGTH_SHORT).show()
                    etEmail.setText("")
                }
            } else {
                Toast.makeText(this, "Enter all the information", Toast.LENGTH_SHORT).show()
            }
        }

        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Recycler View Activity"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    fun isValidEmail(target: CharSequence?): Boolean {
        return !TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches()
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
