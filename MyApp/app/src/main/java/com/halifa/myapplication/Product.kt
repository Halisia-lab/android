package com.halifa.myapplication

import android.graphics.drawable.Drawable
import android.os.Parcelable
import androidx.core.graphics.drawable.DrawableCompat
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Parcelize
data class Product (
    val nom: @RawValue String,
    val marque: @RawValue String,
    val codebarres: @RawValue String,
    val nutriscore: @RawValue Drawable,
    val nutriscore_value: @RawValue String,
    val url: @RawValue String,
    val quantite: @RawValue String,
    val pays: @RawValue String,
    val ingredients: @RawValue String,
    val allergenes: @RawValue String,
    val additifs: @RawValue String,
    val photo: @RawValue Drawable,
    val nutritionFacts:  @RawValue NutritionFacts
):Parcelable {

}
