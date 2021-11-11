package com.halifa.myapplication

import android.content.Context
import android.os.Bundle
import android.util.TypedValue
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import cours.ListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class Recherches: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recherches)

        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.background_toolbar))
        val r = RecherchesItem(getString(R.string.title), getString(R.string.marque), getDrawable(R.drawable.placeholder)!!,
            getString(R.string.nutriscore), getString(R.string.energie))
        val r2 = RecherchesItem(getString(R.string.title), getString(R.string.marque), getDrawable(R.drawable.placeholder)!!,getString(R.string.nutriscore), getString(R.string.energie))

        //val products = listOf(r,r2,r2)

        val nutritionFacts = NutritionFacts(NutritionFactsItem("kj",293,"?"),NutritionFactsItem("g", 0.8,"?"), NutritionFactsItem("g", 0.1, "?"), NutritionFactsItem("g", 8.4, "?"), NutritionFactsItem("g",5.2,"?"), NutritionFactsItem("g", 5.2, "?"),
            NutritionFactsItem("g",4.2,"?"), NutritionFactsItem("g",0.75,"?"), NutritionFactsItem("g",0.295,"?"))

        val p = Product(getString(R.string.title),getString(R.string.marque),getString(R.string.barcode,"3958Z482384"),ContextCompat.getDrawable(this,R.drawable.nutriscore_e)!!,"A","",getString(R.string.quantity),getString(R.string.vendu),getString(R.string.ingredients),getString(R.string.allergenes), getString(R.string.additifs), getDrawable(R.drawable.placeholder)!!, nutritionFacts)
        val products = listOf(p,p,p)
        //recyclerview.layoutManager = GridLayoutManager(this, 2)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = RecherchesListAdapter(products)



    }

}