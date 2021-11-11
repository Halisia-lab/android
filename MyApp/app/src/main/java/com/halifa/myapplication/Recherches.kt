package com.halifa.myapplication

import android.content.Context
import android.os.Bundle
import android.util.TypedValue
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import cours.ListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class Recherches: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recherches)

        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.background_toolbar))
        val r = RecherchesItem(getString(R.string.title), getString(R.string.marque), getDrawable(R.drawable.placeholder)!!,
            getString(R.string.nutriscore), getString(R.string.energie),true)
        val r2 = RecherchesItem(getString(R.string.title), getString(R.string.marque), getDrawable(R.drawable.placeholder)!!,getString(R.string.nutriscore), getString(R.string.energie),false)

        val products = listOf(r,r2,r2)

        //recyclerview.layoutManager = GridLayoutManager(this, 2)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = RecherchesListAdapter(products)



    }

}