package com.legion.lekha.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.legion.lekha.R
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log as Log1

class MainActivity() : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        butShowTost.setOnClickListener {
             Log1.i("MainActivity","Welcome")
            Toast.makeText(this,"Welcome", Toast.LENGTH_LONG).show()
        }
        btnNext1.setOnClickListener {
            val message: String = etUserMessage.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        btnShareToWeb.setOnClickListener {
            val message: String = etUserMessage.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT , message)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Share to : " ))
        }
        btnrecyview.setOnClickListener {

            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
        }
    }