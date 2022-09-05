package com.example.earthquakeMonitor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.earthquakeMonitor.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        //establecemos el layoutManager para el recycler
        binding.eqRecycler.layoutManager = LinearLayoutManager(this)

        //lista de terremotos
        val eqList= mutableListOf<Earthquake>(
            Earthquake("1","Buenos Aires",4.5,234453245L,-102.4528,28.54685),
            Earthquake("2","Lima",2.9,274453255L,-104.4428,28.52565),
            Earthquake("3","Ciudad de Mexico",5.5,276653245L,-108.5528,28.64685),
            Earthquake("4","Bogota",4.9,264893245L,-100.9528,26.55785),
            Earthquake("5","Caracas",5.1,274458945L,-98.8528,28.59985),
            Earthquake("6","Brasilis",2.5,279963245L,-105.8528,28.99685),
            Earthquake("7","Santiago de Chile",6.5,284453245L,-103.2528,28.57685)
        )

        




    }

}