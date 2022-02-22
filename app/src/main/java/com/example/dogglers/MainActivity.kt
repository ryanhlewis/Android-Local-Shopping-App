/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.dogglers

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dogglers.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Setup view binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // If this is their first time in the App, display
        // the App Intro.
        val PREFS_NAME = "MyPrefsFile"

        val settings = getSharedPreferences(PREFS_NAME, 0)

        if (settings.getBoolean("FirstLaunch", true)) {

            // Now, never again!
            settings.edit().putBoolean("FirstLaunch", false).commit()

            // Display the intro page-
            launchIntro()

        }

        // Cart
        binding.CartButton.setOnClickListener { ( launchCart() ) }

        // Launch the VerticalListActivity on verticalBtn click
        binding.verticalBtn.setOnClickListener { launchVertical() }

        // Launch the HorizontalListActivity on horizontalBtn click
        binding.horizontalBtn.setOnClickListener { launchHorizontal() }

        // Launch the GridListActivity on gridBtn click
        binding.gridBtn.setOnClickListener { launchGrid() }

        binding.phonesButton.setOnClickListener { launchShoes() }


    }

    private fun launchIntro() {
        listIntent = Intent(this, IntroActivity::class.java)
        startActivity(listIntent)
    }

    private fun launchCart() {
        listIntent = Intent(this, CartActivity::class.java)
        startActivity(listIntent)
    }

    private fun launchVertical() {
        listIntent = Intent(this, VerticalListActivity::class.java)
        startActivity(listIntent)
    }

    private fun launchHorizontal() {
        listIntent = Intent(this, PhonesActivity::class.java)
        startActivity(listIntent)
    }

    private fun launchGrid() {
        listIntent = Intent(this, BooksActivity::class.java)
        startActivity(listIntent)
    }
    private fun launchShoes() {
        listIntent = Intent(this, ShoesActivity::class.java)
        startActivity(listIntent)
    }

}
