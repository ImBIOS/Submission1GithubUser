package io.github.imbios.submission1githubuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler
<<<<<<< HEAD:app/src/main/java/io/github/imbios/submission1githubuser/SplashActivity.kt
=======
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
>>>>>>> 759f1ed34922ad9149c9c1aa8a907a5c3dab7af3:app/src/main/java/io/github/imbios/submission2githubuser/SplashActivity.kt


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}