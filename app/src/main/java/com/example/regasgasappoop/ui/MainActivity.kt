package com.example.regasgasappoop.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.regasgasappoop.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recargas_btn.setOnClickListener {
            val i = Intent(this,RecargasActivity::class.java)
            startActivity(i)
        }
        paquetes_btn.setOnClickListener {
            val i = Intent(this,PaquetesActivity::class.java)
            startActivity(i)
        }
    }



}