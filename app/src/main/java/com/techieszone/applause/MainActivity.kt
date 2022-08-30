package com.techieszone.applause

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private var mediaPlayer: MediaPlayer?
    private lateinit var mediaPlayerApplause: MediaPlayer
    private lateinit var mediaPlayerGiggle: MediaPlayer
    private lateinit var mediaPlayerBoo: MediaPlayer
    private lateinit var mediaPlayerGunshot: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mediaPlayerApplause = MediaPlayer.create(this, R.raw.applause)
        mediaPlayerGiggle = MediaPlayer.create(this, R.raw.giggle)
        mediaPlayerBoo = MediaPlayer.create(this, R.raw.boo)
        mediaPlayerGunshot = MediaPlayer.create(this, R.raw.gunshot)


        val applauseButton = findViewById<Button>(R.id.btnApplause)
        val giggleButton = findViewById<Button>(R.id.btnGiggle)
        val booButton = findViewById<Button>(R.id.btnBoo)
        val gunshotButton = findViewById<Button>(R.id.btnGunshot)

        val playButton = findViewById<FloatingActionButton>(R.id.fabPlay)
        val pauseButton = findViewById<FloatingActionButton>(R.id.fabPause)
        val stopButton = findViewById<FloatingActionButton>(R.id.fabStop)

        applauseButton.setOnClickListener {
            mediaPlayerApplause.start()
        }
        giggleButton.setOnClickListener {
            mediaPlayerGiggle.start()
        }
        booButton.setOnClickListener {
            mediaPlayerBoo.start()
        }
        gunshotButton.setOnClickListener {
            mediaPlayerGunshot.start()
        }

        playButton.setOnClickListener {
            
        }
        pauseButton.setOnClickListener {
            
        }
        stopButton.setOnClickListener {
            mediaPlayerGunshot.start()
        }







    }
}