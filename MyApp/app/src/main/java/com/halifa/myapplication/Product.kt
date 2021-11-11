package com.halifa.myapplication

import android.graphics.drawable.Drawable
import androidx.core.graphics.drawable.DrawableCompat

data class Product (
    val nom:String,
    val marque:String,
    val codebarres:String,
    val nutriscore:Drawable,
    val nutriscore_value:String,
    val url:String,
    val quantite:String,
    val pays:String,
    val ingredients:String,
    val allergenes:String,
    val additifs:String,
    val photo:Drawable,
    val nutritionFacts: NutritionFacts
        ) {

}
