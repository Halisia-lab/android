package com.halifa.myapplication

import android.content.res.ColorStateList
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.drawable.DrawableCompat
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.nutrition.*

class FragmentNutrition :  Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.nutrition,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        DrawableCompat.setTintList(shape_1.background, ColorStateList.valueOf(resources.getColor(R.color.nutrient_level_low)))
        DrawableCompat.setTintList(shape_2.background, ColorStateList.valueOf(resources.getColor(R.color.nutrient_level_low)))
        DrawableCompat.setTintList(shape_3.background, ColorStateList.valueOf(resources.getColor(R.color.nutrient_level_moderate)))
        DrawableCompat.setTintList(shape_4.background, ColorStateList.valueOf(resources.getColor(R.color.nutrient_level_moderate)))

    }

}
