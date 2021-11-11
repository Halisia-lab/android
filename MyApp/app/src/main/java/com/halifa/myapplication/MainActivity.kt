package com.halifa.myapplication

import android.graphics.Typeface
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.text.SpannableStringBuilder
import android.text.style.StyleSpan
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.home.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.background_toolbar))

        barcode.setBoldText(getString(R.string.barcode,"3958Z482384"))
        additifs.setBoldText(getString(R.string.additifs))
        ingredients.setBoldText(getString(R.string.ingredients))
        allergenes.setBoldText(getString(R.string.allergenes))
        quantity.setBoldText(getString(R.string.quantity))
        vendu.setBoldText(getString(R.string.vendu))

        val nutritionFacts = NutritionFacts(NutritionFactsItem("kj",293,"?"),NutritionFactsItem("g", 0.8,"?"), NutritionFactsItem("g", 0.1, "?"), NutritionFactsItem("g", 8.4, "?"), NutritionFactsItem("g",5.2,"?"), NutritionFactsItem("g", 5.2, "?"),
            NutritionFactsItem("g",4.2,"?"), NutritionFactsItem("g",0.75,"?"), NutritionFactsItem("g",0.295,"?"))

        val product = Product(getString(R.string.title),getString(R.string.marque),getString(R.string.barcode,"3958Z482384"),ContextCompat.getDrawable(this,R.drawable.nutriscore_e)!!,"",getString(R.string.quantity),getString(R.string.vendu),getString(R.string.ingredients),getString(R.string.allergenes), getString(R.string.additifs), nutritionFacts)


        nom.text = product.nom
        marque.text = product.marque
        barcode.text = product.codebarres
        quantity.text = product.quantite
        ingredients.text = product.ingredients
        allergenes.text = product.allergenes
        additifs.text = product.additifs
        vendu.text = product.pays
        nutriscore.setImageDrawable(product.nutriscore)
        //Picasso.get().load(product.url).into(placeholder)



    }
        /*findViewById<View>(R.id.view1).setOnClickListener {
            findViewById<View>(R.id.view2).setBackgroundColor(Color.RED);
        }*/



    fun TextView.setBoldText(text: String, separator: String = ":") {
        val spannable = SpannableStringBuilder(text)
        spannable.setSpan(StyleSpan(Typeface.BOLD),0,text.indexOf(separator) +1,0)
        this.text= spannable
    }
    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val days = listOf("Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche")

        //recyclerview.layoutManager = GridLayoutManager(this, 2)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = ListAdapter(days)
    }

    */
}