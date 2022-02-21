package com.example.dogglers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class IntroActivity : AppCompatActivity() {

    private lateinit var listIntent: Intent


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        val button1 = findViewById<View>(R.id.button) as Button

        // Launch the MainActivity on mainBtn click
        button1.setOnClickListener { launchMain() }

    }

    private fun launchMain() {
        listIntent = Intent(this, MainActivity::class.java)
        startActivity(listIntent)
    }
}