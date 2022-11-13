package com.example.assignment4lesson5

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_new_account.*

class NewAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_account)
        btnCreateAcc.setOnClickListener { fetchAndSendData() }
    }

    @SuppressLint("SuspiciousIndentation")
    fun fetchAndSendData(){
        val intent = Intent(this, MainActivity::class.java)
        val newUser = ArrayList<String>()
            newUser.add(etFirstName.text.toString())
            newUser.add(etLastName.text.toString())
            newUser.add(etEmail.text.toString())
            newUser.add(etPassword.text.toString())
        intent.putExtra("NEW_USER", newUser)
        startActivity(intent)
    }
}