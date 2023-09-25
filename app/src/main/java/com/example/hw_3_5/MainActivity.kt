package com.example.hw_3_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_3_5.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var count = 0
    private var isIncreasing = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnClick.setOnClickListener(){
            if (isIncreasing) {
                count++

            if (count==10) {
                    binding.btnClick.text = "-1"
                    isIncreasing = false}

            }
            else{
                count--
                if (count == 0){
                    val intent = Intent(this,SecondActivity::class.java)
                    startActivity(intent)
                }
            }
            binding.tvNum.text = count.toString()

            }
        }

    }
