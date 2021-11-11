package com.halifa.myapplication

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.graphics.Color
import android.media.Image
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.graphics.drawable.DrawableCompat

import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.nutrition.*

class RecherchesItemViewHolder(v: View) : RecyclerView.ViewHolder(v) {

    val nom = v.findViewById<TextView>(R.id.nom)
    val marque = v.findViewById<TextView>(R.id.marque)
    val photo = v.findViewById<ImageView>(R.id.photo)
    val nutri_score = v.findViewById<TextView>(R.id.nutriscore)
    val calories = v.findViewById<TextView>(R.id.calories)
    val nutriscore_logo = v.findViewById<View>(R.id.nutriscore_logo)
    val calories_logo = v.findViewById<View>(R.id.calories_logo)
    val bookmark = v.findViewById<View>(R.id.bookmark)


    @SuppressLint("ResourceAsColor")
    fun bindProduct(product:RecherchesItem) {
       photo.setImageDrawable(product.photo)
        nom.text = product.nom
        marque.text = product.marque
        nutri_score.text = product.nutriscore
        calories.text = product.calories

    }

}