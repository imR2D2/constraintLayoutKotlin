package com.example.constraintlayouts

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import android.view.View


class MainActivity : AppCompatActivity() {

    //Button Red
    private lateinit var textViewRed: TextView
    private lateinit var changeColorButtonRed: Button

    //Button Yellow
    private lateinit var textViewYellow: TextView
    private lateinit var changeColorButtonYellow: Button

    //Button Green
    private lateinit var textViewGreen: TextView
    private lateinit var changeColorButtonGreen: Button

    //Boxxxxx
    private lateinit var boxThree: TextView
    private lateinit var boxFour: TextView
    private lateinit var boxFive: TextView


    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //Boxxxxx
        boxThree = findViewById(R.id.boxThree)
        boxThree.setOnClickListener {
            val color = ContextCompat.getColor(this, R.color.colorGreen)
            boxThree.setBackgroundColor(color)
        }

        boxFour = findViewById(R.id.boxFour)
        boxFour.setOnClickListener {
            val color = ContextCompat.getColor(this, R.color.colorGreen)
            boxFour.setBackgroundColor(color)
        }

        boxFive = findViewById(R.id.boxFive)
        boxFive.setOnClickListener {
            val color = ContextCompat.getColor(this, R.color.colorGreen)
            boxFive.setBackgroundColor(color)
        }

        //ButtonRedConfiguration
        textViewRed = findViewById(R.id.boxThree)
        changeColorButtonRed = findViewById(R.id.button1)

        changeColorButtonRed.setOnClickListener {
            val colorR = ContextCompat.getColor(this, R.color.colorRed)
            textViewRed.setBackgroundColor(colorR)
        }

        //ButtonYellowConfiguration
        textViewYellow = findViewById(R.id.boxFour)
        changeColorButtonYellow = findViewById(R.id.button2)

        changeColorButtonYellow.setOnClickListener {
            val colorY = ContextCompat.getColor(this, R.color.colorYellow)
            textViewYellow.setBackgroundColor(colorY)
        }

        //ButtonGreenConfiguration
        textViewGreen = findViewById(R.id.boxFive)
        changeColorButtonGreen = findViewById(R.id.button3)

        changeColorButtonGreen.setOnClickListener {
            val colorG = ContextCompat.getColor(this, R.color.colorGreen)
            textViewGreen.setBackgroundColor(colorG)
        }
    }
}