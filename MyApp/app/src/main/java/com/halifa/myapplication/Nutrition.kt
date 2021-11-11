package com.halifa.myapplication

import android.content.res.ColorStateList
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import kotlinx.android.synthetic.main.nutrition.*

class Nutrition: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nutrition)

        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.background_toolbar))

        DrawableCompat.setTintList(shape_1.background, ColorStateList.valueOf(resources.getColor(R.color.nutrient_level_low)))
        DrawableCompat.setTintList(shape_2.background, ColorStateList.valueOf(resources.getColor(R.color.nutrient_level_low)))
        DrawableCompat.setTintList(shape_3.background, ColorStateList.valueOf(resources.getColor(R.color.nutrient_level_moderate)))
        DrawableCompat.setTintList(shape_4.background, ColorStateList.valueOf(resources.getColor(R.color.nutrient_level_moderate)))

    }

}