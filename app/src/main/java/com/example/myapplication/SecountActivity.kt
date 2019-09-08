package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secount)
        val toolbar = actionBar
        toolbar?.setTitle("Secound Activty")
    }
}
