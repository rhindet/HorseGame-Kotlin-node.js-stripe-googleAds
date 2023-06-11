package com.example.horsegame

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TermsActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms)
    }
    private fun termsSeup() {
        var sharedPreferences: SharedPreferences
        sharedPreferences = getSharedPreferences("sharedPrefs",MODE_PRIVATE)
        var editor = sharedPreferences.edit()
        editor.apply{
            putBoolean("firstRun",false)
        }.apply()
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

    fun AceptedTerms(view: View) {
        termsSeup()
    }
}