package com.kanayo.tabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kanayo.tabs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var whatsappAdapter: WhatsappAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        whatsappAdapter = WhatsappAdapter(supportFragmentManager)
        binding.pager.adapter = whatsappAdapter
        binding.tabLayout.setupWithViewPager(binding.pager)
    }
}