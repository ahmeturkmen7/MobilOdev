package com.ahmetturkmen.mobilodev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashEkranActivity : AppCompatActivity() {

    private val splashEkranActivitytimeout : Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_ekran)
        loadSplashScreen()

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
             finish()

        }, splashEkranActivitytimeout)
    }
    private fun loadSplashScreen(){
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity:: class.java))
        }, 3000)
    }

}