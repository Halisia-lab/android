package com.halifa.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.infos.*

class FragmentInfos :  Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.infos,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nutritionFacts = NutritionFacts(NutritionFactsItem("kj",293,"?"),NutritionFactsItem("g", 0.8,"?"), NutritionFactsItem("g", 0.1, "?"), NutritionFactsItem("g", 8.4, "?"), NutritionFactsItem("g",5.2,"?"), NutritionFactsItem("g", 5.2, "?"),
            NutritionFactsItem("g",4.2,"?"), NutritionFactsItem("g",0.75,"?"), NutritionFactsItem("g",0.295,"?"))

        val product = Product("Petits pois et carottes","Cassegrain","3958Z482384",
            ContextCompat.getDrawable(requireActivity().applicationContext,R.drawable.nutriscore_e)!!,"A","","400 g (280g net égoutté)","France, Japon, Suisse","Petits pois 66%, eau, garniture 2,8% (salade, oignon, grelot), sucre, sel, arôme naturel","Aucune", "Aucun", ContextCompat.getDrawable(requireActivity().applicationContext, R.drawable.placeholder)!!, nutritionFacts)

        value_energie_100g.text = String.format(product.nutritionFacts.energie.quantite_pour_100g.toString() + " " +  product.nutritionFacts.energie.unite)
        value_matieres_grasses_100g.text = String.format(product.nutritionFacts.matieres_grasses.quantite_pour_100g.toString()+" "+product.nutritionFacts.matieres_grasses.unite)
        value_acides_100g.text = String.format(product.nutritionFacts.acides_gras.quantite_pour_100g.toString() + " " +  product.nutritionFacts.acides_gras.unite)
        value_glucides_100g.text = String.format(product.nutritionFacts.glucides.quantite_pour_100g.toString() + " " +  product.nutritionFacts.glucides.unite)
        value_sucres_100g.text = String.format(product.nutritionFacts.sucres.quantite_pour_100g.toString() + " " +  product.nutritionFacts.sucres.unite)
        value_fibres_100g.text = String.format(product.nutritionFacts.fibres.quantite_pour_100g.toString() + " " +  product.nutritionFacts.fibres.unite)
        value_proteines_100g.text = String.format(product.nutritionFacts.proteines.quantite_pour_100g.toString() + " " +  product.nutritionFacts.proteines.unite)
        value_sel_100g.text = String.format(product.nutritionFacts.sel.quantite_pour_100g.toString() + " " +  product.nutritionFacts.sel.unite)
        value_sodium_100g.text = String.format(product.nutritionFacts.sodium.quantite_pour_100g.toString() + " " +  product.nutritionFacts.sodium.unite)

        value_energie_part.text = String.format(product.nutritionFacts.energie.quantite_par_portion)
        value_matieres_grasses_part.text = String.format(product.nutritionFacts.matieres_grasses.quantite_par_portion)
        value_acides_part.text = String.format(product.nutritionFacts.acides_gras.quantite_par_portion)
        value_glucides_part.text = String.format(product.nutritionFacts.glucides.quantite_par_portion)
        value_sucres_part.text = String.format(product.nutritionFacts.sucres.quantite_par_portion)
        value_fibres_part.text = String.format(product.nutritionFacts.fibres.quantite_par_portion)
        value_proteines_part.text = String.format(product.nutritionFacts.proteines.quantite_par_portion)
        value_sel_part.text = String.format(product.nutritionFacts.sel.quantite_par_portion)
        value_sodium_part.text = String.format(product.nutritionFacts.sodium.quantite_par_portion)

    }

}