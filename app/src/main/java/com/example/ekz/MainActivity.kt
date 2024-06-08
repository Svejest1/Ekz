package com.example.ekz


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.ceil
import kotlin.math.round


class MainActivity : AppCompatActivity() {


    private lateinit var inputNumber: EditText
    private lateinit var resultText: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        inputNumber = findViewById(R.id.inputNumber)
        val roundButton: Button = findViewById(R.id.roundButton)
        resultText = findViewById(R.id.resultText)


        roundButton.setOnClickListener {
            roundNumber()
        }
    }


    private fun roundNumber() {
        try {
            val input = inputNumber.text.toString()
            if (input.isEmpty()) {
                Toast.makeText(this, "Пожалуйста, введите число", Toast.LENGTH_SHORT).show()
                return
            }


            val number = input.toDouble()
            val roundedNumber = round(number).toInt()


            resultText.text = "Округленное число: $roundedNumber"
        } catch (e: NumberFormatException) {
            Toast.makeText(this, "Пожалуйста, введите действительное число", Toast.LENGTH_SHORT).show()
        }
    }
}