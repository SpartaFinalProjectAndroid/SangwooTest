package com.example.sangwootest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sangwootest.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val netWorkRepository = WeatherRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        CoroutineScope(Dispatchers.Main).launch {
//            val weatherCurrentList = netWorkRepository.getCurrentList(selectedItemId)
//            val forecastWeatherData = netWorkRepository.getWeekendList(selectedItemId)
        }

        //dkssdudfsjefisef


    }
}
