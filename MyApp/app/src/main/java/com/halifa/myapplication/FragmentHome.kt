package com.halifa.myapplication

import android.annotation.SuppressLint
import android.graphics.Typeface
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.style.StyleSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.core.content.ContextCompat
import androidx.core.text.toSpannable
import androidx.fragment.app.Fragment

import kotlinx.android.synthetic.main.home.*


class FragmentHome :  Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.home,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            barcode.setBoldText(getString(R.string.barcode))
            additifs.setBoldText(getString(R.string.additifs))
            ingredients.setBoldText(getString(R.string.ingredients))
            allergenes.setBoldText(getString(R.string.allergenes))
            quantity.setBoldText(getString(R.string.quantity))
            vendu.setBoldText(getString(R.string.vendu))

            val nutritionFacts = NutritionFacts(NutritionFactsItem("kj",293,"?"),NutritionFactsItem("g", 0.8,"?"), NutritionFactsItem("g", 0.1, "?"), NutritionFactsItem("g", 8.4, "?"), NutritionFactsItem("g",5.2,"?"), NutritionFactsItem("g", 5.2, "?"),
                NutritionFactsItem("g",4.2,"?"), NutritionFactsItem("g",0.75,"?"), NutritionFactsItem("g",0.295,"?"))

            val product = Product("Petits pois et carottes","Cassegrain","3958Z482384",
                ContextCompat.getDrawable(requireActivity().applicationContext,R.drawable.nutriscore_e)!!,"A","","400 g (280g net égoutté)","France, Japon, Suisse","Petits pois 66%, eau, garniture 2,8% (salade, oignon, grelot), sucre, sel, arôme naturel","Aucune", "Aucun", ContextCompat.getDrawable(requireActivity().applicationContext, R.drawable.placeholder)!!, nutritionFacts)

            bindProduct(product)

            //Picasso.get().load(product.url).into(placeholder)

        }
        @SuppressLint("SetTextI18n")
        fun bindProduct(product: Product) {
            nom.text = product.nom
            marque.text = product.marque
            barcode.text = getString(R.string.barcode) +" "+ product.codebarres
            quantity.text = getString(R.string.quantity) +" "+ product.quantite
            ingredients.text = getString(R.string.ingredients) +" "+ product.ingredients
            allergenes.text = getString(R.string.allergenes) +" "+ product.allergenes
            additifs.text = getString(R.string.additifs) +" "+ product.additifs
            vendu.text = getString(R.string.vendu) +" "+ product.pays
            nutriscore.setImageDrawable(product.nutriscore)
        }

        fun TextView.setBoldText(text: String, separator: String = ":") {
            val spannable = SpannableStringBuilder(text)
            spannable.setSpan(StyleSpan(Typeface.BOLD),0,text.indexOf(separator) +1,0)
            this.text = spannable
        }
    }

