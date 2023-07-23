package com.example.majorenvironmentalmovements

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.TextView

class NewsDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_detail)

        val heading = intent.getStringExtra("heading")
        val imageId = intent.getIntExtra("imageId",R.drawable.img)
        val newscontent = intent.getStringExtra("newscontent")

        val header = findViewById<TextView>(R.id.tvheading)
        val image = findViewById<ImageView>(R.id.imageView)
        val content = findViewById<TextView>(R.id.tvnewsContent)

        header.text=heading
        content.text=newscontent
        image.setImageResource(imageId)
    }
}