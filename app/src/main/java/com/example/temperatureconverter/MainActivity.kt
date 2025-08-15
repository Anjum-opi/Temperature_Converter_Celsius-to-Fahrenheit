package com.example.temperatureconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val celsiusEditText: EditText = findViewById(R.id.celsiusEditText)
        val convertButton: Button = findViewById(R.id.convertButton)

        val fahrenheitTextView: TextView = findViewById(R.id.fahrenheitTextView)


        convertButton.setOnClickListener {

            val celsiusString = celsiusEditText.text.toString()

            if (celsiusString.isNotEmpty()) {

                val celsiusValue = celsiusString.toDouble()


                // Formula: F = C * 9/5 + 32
                val fahrenheitValue = (celsiusValue * 9.0 / 5.0) + 32

                fahrenheitTextView.text = String.format("%.2f °F", fahrenheitValue)

            } else {

                Toast.makeText(this, "Please enter a temperature in Celsius", Toast.LENGTH_SHORT).show()
            }
        }
    }
}