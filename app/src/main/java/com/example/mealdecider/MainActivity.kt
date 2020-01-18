package com.example.mealdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Garri", "Spagetti", "Indomie", "SemoVita")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FOODdecidebtn.setOnClickListener {
            val random = Random ()
            val randomFOOD = random.nextInt(foodList.count())
            SelectMealtext.text = foodList[randomFOOD]
        }
        addfoodbtn.setOnClickListener {
            val newFood = Foodinputxt.text.toString()
            foodList.add(newFood)
            Foodinputxt.text.clear()
            println(foodList)
        }

    }
}
