package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intent.databinding.ActivityMainBinding
import com.example.intent.models.User

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //finish() esinga kelsin 53 video

        //1 bu bolimlarga ajratib qoydim ikkinchi oynada ham 1 bolsa ikkalasi bitta loyixa
        /*val intent = Intent(this, MainActivity2::class.java)//bu yerda bbitta ozgaruvchiga intentni
        // olib qaysi oynaga otishini korsatib qoydim
        startActivity(intent)//bu yerda shunchaki qanday boshlanishini korsatib qoydim*/

        //2
        binding.btnNext.setOnClickListener {
            val user = User(
                binding.name.text.toString(),
                binding.age.text.toString()
            )
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("key", user)
            startActivity(intent)
        }
    }
}