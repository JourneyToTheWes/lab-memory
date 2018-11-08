package edu.uw.memorylab

import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView

class BirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bird)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        findViewById(R.id.btnBirdNext)!!.setOnClickListener { startActivity(Intent(this@BirdActivity, BlankBirdActivity::class.java)) }
    }

    override fun onStart() {
        /* Set up image */
        val image = ContextCompat.getDrawable(this, R.drawable.hummingbird) //get the drawable resource
        val birdView = findViewById(R.id.imgBird) as ImageView?
        birdView!!.setImageDrawable(image)
        super.onStart()
    }

    override fun onStop() {
        val birdImageView:ImageView = findViewById(R.id.imgBird) as ImageView
        birdImageView.setImageDrawable(null)
        super.onStop()
    }
}
