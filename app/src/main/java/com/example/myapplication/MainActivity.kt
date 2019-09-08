package com.example.myapplication

import android.app.PendingIntent
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(p0: View) {
        when (p0.id) {
            R.id.bt_main_intent -> {
                val explictIntent = Intent(this, SecountActivity::class.java)
                startActivity(explictIntent)
            }
            R.id.bt_main_implictintent -> {
                val explictIntent = Intent(Intent.ACTION_SENDTO)
                explictIntent.putExtra("Data", "Hello")
                explictIntent.setType("text/plain")
                startActivity(explictIntent)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt_main_intent.setOnClickListener(this)
        bt_main_implictintent.setOnClickListener(this)

    }
}
