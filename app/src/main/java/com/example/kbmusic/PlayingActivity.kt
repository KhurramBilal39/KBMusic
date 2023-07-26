package com.example.kbmusic

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PlayingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playing)

        supportActionBar?.hide()
    }
}