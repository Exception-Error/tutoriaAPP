package de.noctrl.tutoriaapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //diese Variablen deklarationen werden nur gebraucht wenn import kotlinx.android.synthetic.main.activity_main.* nicht benutzt wird
        /*
        val counterTxt = findViewById<TextView>(R.id.TextView1)
        val countButton = findViewById<Button>(R.id.button1)
        val resetButton = findViewById<Button>(R.id.button2)
        */

        var counter = 0

        counterTxt.text = "$counter"
        
        countButton.setOnClickListener { 
            counter++
            counterTxt.text = "$counter"
        }
        
        resetButton.setOnClickListener{
            counter=0
            counterTxt.text = "$counter"
        }
    }
}