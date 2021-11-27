package com.halifa.myapplication

import android.graphics.Typeface
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.commit


//MyGES : rendu pour lundi soir 23h59

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.background_toolbar))

        val nutritionFacts = NutritionFacts(NutritionFactsItem("kj",293,"?"),NutritionFactsItem("g", 0.8,"?"), NutritionFactsItem("g", 0.1, "?"), NutritionFactsItem("g", 8.4, "?"), NutritionFactsItem("g",5.2,"?"), NutritionFactsItem("g", 5.2, "?"),
            NutritionFactsItem("g",4.2,"?"), NutritionFactsItem("g",0.75,"?"), NutritionFactsItem("g",0.295,"?"))


        val product = Product("Petits pois et carottes","Cassegrain","3958Z482384",
            ContextCompat.getDrawable(this,R.drawable.nutriscore_e)!!,"A","","400 g (280g net égoutté)","France, Japon, Suisse","Petits pois 66%, eau, garniture 2,8% (salade, oignon, grelot), sucre, sel, arôme naturel","Aucune", "Aucun", ContextCompat.getDrawable(this, R.drawable.placeholder)!!, nutritionFacts)

        /*supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment_container, DetailsFragment.newInstance(product))
            .commitAllowingStateLoss()*/
    }

    /* Notes */
    /*
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val days = listOf("Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche")

            //recyclerview.layoutManager = GridLayoutManager(this, 2)
            recyclerview.layoutManager = LinearLayoutManager(this)
            recyclerview.adapter = ListAdapter(days)
        }

        findViewById<View>(R.id.view1).setOnClickListener {
            findViewById<View>(R.id.view2).setBackgroundColor(Color.RED);
        }


    */
}
//creer 3 fragement qui contiennent chacun des ecrans
