package com.mertadali.kotlinintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        // getIntent
        val intent = intent
       val name =intent.getStringExtra("name")
        val surname =intent.getStringExtra("surname")
        nameTextNext.text = "Username: " +name
        surnameTextNext.text = "Usersurname: "+surname
    }
}
