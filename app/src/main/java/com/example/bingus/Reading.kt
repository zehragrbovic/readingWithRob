package com.example.bingus


import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.File
import java.io.FileInputStream
import java.io.InputStreamReader
import java.lang.StringBuilder

class Reading : AppCompatActivity() {

    private var progress = 0
    private var actor1speaking = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reading2)

       val file = File("path/to/file.txt")
        val textView1 = findViewById<TextView>(R.id.text_view_1)
        val textView2 = findViewById<TextView>(R.id.text_view_2)

        displayTextFile(file, textView1, textView2)


    }

    fun displayTextFile(file: File, textView1: TextView, textView2: TextView) {
        val text = StringBuilder()

        try {
            val inputStream = FileInputStream(file)
            val reader = BufferedReader(InputStreamReader(inputStream))

            var line: String?
            while (reader.readLine().also { line = it } != null) {
                // split paragraph into two parts
                val splitIndex = line!!.length / 2
                val firstPart = line!!.substring(0, splitIndex)
                val secondPart = line!!.substring(splitIndex)

                // append first part to textView1
                textView1.append("$firstPart\n")

                // append second part to textView2
                textView2.append("$secondPart\n")
            }

            reader.close()
            inputStream.close()
        } catch (e: Exception) {
            // handle exception
        }
    }}