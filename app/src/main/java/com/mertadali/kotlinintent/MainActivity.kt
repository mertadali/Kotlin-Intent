package com.mertadali.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_next.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun next(view: View){
        val intent = Intent(applicationContext,NextActivity::class.java)
    // Intent de bir context bir de gidilecek sınıf ismini ister. kullanımı yukarıdaki gibidir.
       intent.putExtra("name",nameTextNext.text.toString())
        intent.putExtra("surname",surnameTextNext.text.toString())

        startActivity(intent)
        finish()

    }
}