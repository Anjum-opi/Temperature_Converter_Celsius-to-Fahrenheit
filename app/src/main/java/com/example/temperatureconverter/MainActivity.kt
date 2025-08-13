package com.example.temperatureconverter // আপনার প্যাকেজ নামটি এখানে থাকবে

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


                // Formula: F = (C * 9/5) + 32
                val fahrenheitValue = (celsiusValue * 9 / 5) + 32

                // ফলাফল TextView এ দেখানো
                // %.2f দিয়ে দশমিকের পর দুটি সংখ্যা দেখানো হয়েছে
                fahrenheitTextView.text = "Fahrenheit: %.2f".format(fahrenheitValue)

            } else {
                Toast.makeText(this, "Please enter a Celsius value.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}