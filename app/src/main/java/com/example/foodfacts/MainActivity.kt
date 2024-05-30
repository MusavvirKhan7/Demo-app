package com.example.foodfacts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var foodarraylist : ArrayList<food>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.listoffood)

        var foodimgArray = arrayOf(
            R.drawable.chickenbiryani,
            R.drawable.nihari,
            R.drawable.paya,
            R.drawable.arabshawarma,
            R.drawable.mcchicken,
            R.drawable.doppler,
            R.drawable.deepdish,
            R.drawable.chickentenders
        )

        var foodtitle = arrayOf(
            "CHICKEN BIRYANI",
            "NIHARI",
            "PAYA",
            "ARABIC SHAWARMA",
            "MCCHICKEN",
            "CHICKEN DOPPLER",
            "DEEP DISH PIZZA",
            "CHICKEN TENDERS"
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        foodarraylist = arrayListOf<food>()

        for ( index in foodimgArray.indices) {
            val foodie = food(foodtitle[index], foodimgArray[index])
            foodarraylist.add(foodie)
        }

        recyclerView.adapter = MyAdapter(foodarraylist)


    }
}