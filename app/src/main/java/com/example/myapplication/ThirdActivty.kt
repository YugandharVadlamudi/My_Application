package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ThirdActivty : AppCompatActivity() {
    val TAG = ThirdActivty::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_activty)
        val intent = getIntent()
         Log.e(TAG, ":${intent.getStringExtra("Data")} ");
    }
}
