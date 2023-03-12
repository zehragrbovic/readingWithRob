package com.example.bingus


import android.R
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import com.example.bingus.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.book_selection)

        val bookButton = findViewById<ImageButton>(R.id.book_button)
        val bookButton2 = findViewById<ImageButton>(R.id.book_button2)
        val bookButton3 = findViewById<ImageButton>(R.id.book_button3)
        val educationalButton = findViewById<Button>(R.id.edu_button)
        val entertainmentButton = findViewById<Button>(R.id.ent_button)
        val uploadButton = findViewById<Button>(R.id.upload_button)
        val scanButton = findViewById<Button>(R.id.scan_button)

        bookButton.setOnClickListener {
            val intent = Intent(this, review::class.java)
            startActivity(intent)
        }

       // educationalButton.setOnClickListener {
            // Do something when the educationalButton is clicked


       // uploadButton.setOnClickListener {
            // Do something when the uploadButton is clicked











    }


    fun openNextLayout(view: View?) {
      //  setContentView(R.layout.activity_next);
        val intent = Intent(this, review);
        startActivity(intent);

    }







}