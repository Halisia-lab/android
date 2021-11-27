package com.halifa.myapplication

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.graphics.Color
import android.media.Image
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.DrawableCompat
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager

import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import kotlinx.android.synthetic.main.nutrition.*

class RecherchesItemViewHolder(v: View, a: FragmentActivity) : RecyclerView.ViewHolder(v) {

    val nom = v.findViewById<TextView>(R.id.nom)
    val marque = v.findViewById<TextView>(R.id.marque)
    val photo = v.findViewById<ImageView>(R.id.photo)
    val nutri_score = v.findViewById<TextView>(R.id.nutriscore)
    val calories = v.findViewById<TextView>(R.id.calories)
    val cell = v.findViewById<MaterialCardView>(R.id.cell)
    var activity = a

    fun bindProduct(product:Product) {
       photo.setImageDrawable(product.photo)
        nom.text = product.nom
        marque.text = product.marque
        nutri_score.text = String.format("Nutriscore : "+product.nutriscore_value)
        calories.text = String.format(product.nutritionFacts.energie.quantite_pour_100g.toString() + " kCal/part")
        cell.setOnClickListener {
            val fragmentManager: FragmentManager = (activity as AppCompatActivity).supportFragmentManager
            fragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment_container, DetailsFragment.newInstance(product))
                .commitAllowingStateLoss();
        }
    }

}