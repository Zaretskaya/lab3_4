package com.dao.lab3_4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView


class Act2 : AppCompatActivity() {

    lateinit var navView: BottomNavigationView

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_about -> {
                startActivity(Intent(applicationContext,Act_About::class.java))
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        findViewById<Button>(R.id.button1).setOnClickListener {
            startActivity(Intent(this, Act1::class.java).setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT))
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            startActivity(Intent(this, Act3::class.java).setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT))
        }

        navView = findViewById(R.id.nav_view)
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }


    override fun onResume() {
        Act_About.text = "This is Activity 2"
        super.onResume()
    }

}