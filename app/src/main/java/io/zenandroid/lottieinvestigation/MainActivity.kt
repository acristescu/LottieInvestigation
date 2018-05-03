package io.zenandroid.lottieinvestigation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {

    lateinit var row: View
    lateinit var animationView: LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animationView = findViewById(R.id.animation_view)
        row = findViewById<View>(R.id.row)

        animationView.apply {
            speed = -2.5f
            useHardwareAcceleration(true)
        }
        row.setOnClickListener {
            animationView.apply {
                animationView.speed = -speed
                setMinAndMaxFrame(0, 30)
                if (!isAnimating) {
                    playAnimation()
                }
            }
        }
    }
}
