package com.part1.counting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtNumberView = findViewById<TextView>(R.id.textNumber)
        val resetBtnView = findViewById<Button>(R.id.resetBtn)
        val plusBtnView = findViewById<Button>(R.id.plusBtn)

        var number = 0

        txtNumberView.text = number.toString()

        resetBtnView.setOnClickListener{
            number = 0
            txtNumberView.text = number.toString()
        }

        plusBtnView.setOnClickListener {
            number++
            txtNumberView.text = number.toString()
        }
    }
}