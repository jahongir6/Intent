package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intent.databinding.ActivityMain2Binding
import com.example.intent.models.User

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        //1 bu bolimlarga ajratib qoydim birinchi oynada ham 1 bolsa ikkalasi bitta loyixa
       /* //bu yerda qanday jarayon ketyapti desangi shu oynani tugatadida va birinchi oynaga qaytip qoladi
        binding.tvFinish.setOnClickListener {
            finish()
        }*/

        //2
        // activitidan activitiga malumot olib otish
        var use:User = intent.getSerializableExtra("key") as User
        binding.tvFinish.text= use.toString()
        binding.tvFinish.setOnClickListener {
            finish()
        }
    }
}