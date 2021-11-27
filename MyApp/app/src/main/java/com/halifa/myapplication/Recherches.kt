package com.halifa.myapplication

import android.content.Context
import android.os.Bundle
import android.util.TypedValue
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import cours.ListAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.recherches.*

class Recherches: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recherches)

        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.background_toolbar))
        val r = RecherchesItem("Petits pois et carottes", "Cassegrain", getDrawable(R.drawable.placeholder)!!,
            getString(R.string.nutriscore), getString(R.string.energie))
        val r2 = RecherchesItem("Petits pois et carottes", "Cassegrain", getDrawable(R.drawable.placeholder)!!,getString(R.string.nutriscore), getString(R.string.energie))

        //val products = listOf(r,r2,r2)

        val nutritionFacts = NutritionFacts(NutritionFactsItem("kj",293,"?"),NutritionFactsItem("g", 0.8,"?"), NutritionFactsItem("g", 0.1, "?"), NutritionFactsItem("g", 8.4, "?"), NutritionFactsItem("g",5.2,"?"), NutritionFactsItem("g", 5.2, "?"),
            NutritionFactsItem("g",4.2,"?"), NutritionFactsItem("g",0.75,"?"), NutritionFactsItem("g",0.295,"?"))

        val p = Product("Petits pois et carottes","Cassegrain","3958Z482384",
            ContextCompat.getDrawable(this.applicationContext,R.drawable.nutriscore_e)!!,"A","","400 g (280g net égoutté)","France, Japon, Suisse","Petits pois 66%, eau, garniture 2,8% (salade, oignon, grelot), sucre, sel, arôme naturel","Aucune", "Aucun", ContextCompat.getDrawable(this, R.drawable.placeholder)!!, nutritionFacts)
        val p2 = Product("1","Cassegrain","3958Z482384",
            ContextCompat.getDrawable(this.applicationContext,R.drawable.nutriscore_e)!!,"A","","400 g (280g net égoutté)","France, Japon, Suisse","Petits pois 66%, eau, garniture 2,8% (salade, oignon, grelot), sucre, sel, arôme naturel","Aucune", "Aucun", ContextCompat.getDrawable(this, R.drawable.placeholder)!!, nutritionFacts)
        val p3 = Product("2","Cassegrain","3958Z482384",
            ContextCompat.getDrawable(this.applicationContext,R.drawable.nutriscore_e)!!,"A","","400 g (280g net égoutté)","France, Japon, Suisse","Petits pois 66%, eau, garniture 2,8% (salade, oignon, grelot), sucre, sel, arôme naturel","Aucune", "Aucun", ContextCompat.getDrawable(this, R.drawable.placeholder)!!, nutritionFacts)
        val products = listOf(p,p2,p3)
        //recyclerview.layoutManager = GridLayoutManager(this, 2)
        recyclerview.layoutManager = LinearLayoutManager(this)

    }

}