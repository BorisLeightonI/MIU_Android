package com.example.assignment4lesson5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_shoping.*

class Shoping : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shoping)
        getUSerName()
        tvItem1.setOnClickListener{Toast.makeText(this, "selected ${tvItem1.text}",Toast.LENGTH_LONG).show()}
        btnItem2.setOnClickListener{Toast.makeText(this, "selected ${btnItem2.text}",Toast.LENGTH_LONG).show()}
        tvItem3.setOnClickListener{Toast.makeText(this, "selected ${tvItem3.text}",Toast.LENGTH_LONG).show()}
        tvItem4.setOnClickListener{Toast.makeText(this, "selected ${tvItem4.text}",Toast.LENGTH_LONG).show()}

    }
    fun getUSerName() {
        val bundle = intent.extras
        val username = bundle?.get("USER_NAME")
        tvUserName.text = "Welcome ${username.toString()}"
    }
}