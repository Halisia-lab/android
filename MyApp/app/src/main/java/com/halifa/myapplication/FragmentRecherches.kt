package com.halifa.myapplication

import android.content.res.ColorStateList
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.nutrition.*
import kotlinx.android.synthetic.main.recherches.*

class FragmentRecherches: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.recherches,
            container,
            false
        )
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val r = RecherchesItem("Petits pois et carottes", "Cassegrain",  ContextCompat.getDrawable(requireActivity().applicationContext, R.drawable.placeholder)!!,
            getString(R.string.nutriscore), getString(R.string.energie))
        val r2 = RecherchesItem("Petits pois et carottes", "Cassegrain",  ContextCompat.getDrawable(requireActivity().applicationContext, R.drawable.placeholder)!!,getString(R.string.nutriscore), getString(R.string.energie))

        //val products = listOf(r,r2,r2)

        val nutritionFacts = NutritionFacts(NutritionFactsItem("kj",293,"?"),NutritionFactsItem("g", 0.8,"?"), NutritionFactsItem("g", 0.1, "?"), NutritionFactsItem("g", 8.4, "?"), NutritionFactsItem("g",5.2,"?"), NutritionFactsItem("g", 5.2, "?"),
            NutritionFactsItem("g",4.2,"?"), NutritionFactsItem("g",0.75,"?"), NutritionFactsItem("g",0.295,"?"))

        val p = Product("Petits pois et carottes","Cassegrain","3958Z482384",
            ContextCompat.getDrawable(requireActivity().applicationContext,R.drawable.nutriscore_e)!!,"A","","400 g (280g net égoutté)","France, Japon, Suisse","Petits pois 66%, eau, garniture 2,8% (salade, oignon, grelot), sucre, sel, arôme naturel","Aucune", "Aucun", ContextCompat.getDrawable(requireActivity().applicationContext, R.drawable.placeholder)!!, nutritionFacts)
        val products = listOf(p,p,p)
        //recyclerview.layoutManager = GridLayoutManager(this, 2)
        recyclerview.layoutManager = LinearLayoutManager(requireActivity().applicationContext)
        recyclerview.adapter = RecherchesListAdapter(products)

    }
}