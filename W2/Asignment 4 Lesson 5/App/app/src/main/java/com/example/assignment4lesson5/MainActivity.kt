package com.example.assignment4lesson5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_shoping.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var user1 = User("user1","lastUser1","user1@mail.com", "123456")
        var user2 = User("user2","lastUser2","user2", "123456")
        var user3 = User("user3","lastUser3","user3", "123456")
        var user4 = User("user4","lastUser4","user4", "123456")
        var user5 = User("user5","lastUser5","user5", "123456")

        val userList = ArrayList<User>()
        userList.add(user1)
        userList.add(user2)
        userList.add(user3)
        userList.add(user4)
        userList.add(user5)

        btnSignIn.setOnClickListener { verifyUser(userList) }

        btnCreateNewAcc.setOnClickListener { startActivity(Intent(this, NewAccount::class.java)) }
        var newUser = getNewUser()
        userList.add(newUser)

        tvForgotPassword.setOnClickListener{Toast.makeText(this, "Not implemented", Toast.LENGTH_LONG).show()}

    }
    fun verifyUser(userList: ArrayList<User>){
        var copyUser1 =  User("user1","lastUser1",etEmail.text.toString(), etPassword.text.toString())
        if(userList.contains(copyUser1)){
            Toast.makeText(this, "Found User", Toast.LENGTH_LONG).show()
            val intent = Intent(this,Shoping::class.java)
            intent.putExtra("USER_NAME", etEmail.text.toString())
            startActivity(intent)
        }else {
            Toast.makeText(this, "User NOT Found", Toast.LENGTH_LONG).show()
        }
    }

    fun getNewUser(): User {
        val bundle = intent.extras
        val newUserData = bundle?.getStringArrayList("NEW_USER")

            if(newUserData != null && newUserData.size>0){
                Toast.makeText(this, newUserData?.get(0).toString(), Toast.LENGTH_LONG).show()
                var newUser = User(newUserData[0], newUserData[1], newUserData[2], newUserData[3])
                return newUser
            }
        return User("","","","")
    }
}