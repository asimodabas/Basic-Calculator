package com.asimodabas.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewSonuc.text = "0"

        buttonToplama.setOnClickListener {
            val alinanSayi1 = editTextSayi1.text.toString().toIntOrNull()
            val alinanSayi2 = editTextSayi2.text.toString().toIntOrNull()

            if (alinanSayi1 == null || alinanSayi2 == null) {

                textViewSonuc.text = "Please Enter Number"
            } else {
                val toplam = alinanSayi1 + alinanSayi2
                textViewSonuc.text = toplam.toString()
            }
        }
        buttonCarpma.setOnClickListener {
            val alinanSayi1 = editTextSayi1.text.toString().toIntOrNull()
            val alinanSayi2 = editTextSayi2.text.toString().toIntOrNull()

            if (alinanSayi1 == null || alinanSayi2 == null) {

                textViewSonuc.text = "Please Enter Number"
            } else {
                val carpma = alinanSayi1 * alinanSayi2
                textViewSonuc.text = carpma.toString()
            }
        }
        buttonBolme.setOnClickListener {
            val alinanSayi1 = editTextSayi1.text.toString().toIntOrNull()
            val alinanSayi2 = editTextSayi2.text.toString().toIntOrNull()

            if (alinanSayi1 == null || alinanSayi2 == null) {

                textViewSonuc.text = "Please Enter Number"
            } else {
                val bolme = alinanSayi1.toFloat() / alinanSayi2.toFloat()
                textViewSonuc.text = bolme.toString()
            }


        }
        buttonCıkarma.setOnClickListener {
            val alinanSayi1 = editTextSayi1.text.toString().toIntOrNull()
            val alinanSayi2 = editTextSayi2.text.toString().toIntOrNull()

            if (alinanSayi1 == null || alinanSayi2 == null) {

                textViewSonuc.text = "Please Enter Number"
            } else {
                val cikarma = alinanSayi1 - alinanSayi2
                textViewSonuc.text = cikarma.toString()
            }
        }
    }
}