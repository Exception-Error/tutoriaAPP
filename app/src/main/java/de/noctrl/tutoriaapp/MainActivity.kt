package de.noctrl.tutoriaapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import de.noctrl.tutoriaapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var counter = 0

        binding.counterTxt.text = "$counter"

        binding.countButton.setOnClickListener {
            counter++
            binding.counterTxt.text = "$counter"
        }

        binding.resetButton.setOnClickListener {
            counter = 0
            binding.counterTxt.text = "$counter"
        }

    }
}