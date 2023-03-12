package com.example.bingus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView


class review : AppCompatActivity() {

    private lateinit var bookImage: ImageView
    private lateinit var ratingBar: RatingBar
    private lateinit var summary: TextView
    private lateinit var userReview1: TextView
    private lateinit var userReview2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        bookImage = findViewById(R.id.book_image)
        ratingBar = findViewById(R.id.rating_bar)
        summary = findViewById(R.id.summary)
        userReview1 = findViewById(R.id.user_review_1)
        userReview2 = findViewById(R.id.user_review_2)

        val people_button = findViewById<ImageButton>(R.id.people_button)
        val audio_button = findViewById<ImageButton>(R.id.audio_button)
        val book_button = findViewById<ImageButton>(R.id.book_button)

        people_button.setOnClickListener {
            val intent = Intent(this, Reading::class.java)
            startActivity(intent)
        }

    }
}

