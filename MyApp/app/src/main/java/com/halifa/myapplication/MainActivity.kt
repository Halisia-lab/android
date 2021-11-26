package com.halifa.myapplication

import android.graphics.Typeface
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.commit


//MyGES : rendu pour lundi soir 23h59

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.background_toolbar))

        supportFragmentManager.beginTransaction()
            .replace(R.id.container_view, DetailsFragment())
            .commitAllowingStateLoss()
    }

    /* Notes */
    /*
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val days = listOf("Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche")

            //recyclerview.layoutManager = GridLayoutManager(this, 2)
            recyclerview.layoutManager = LinearLayoutManager(this)
            recyclerview.adapter = ListAdapter(days)
        }

        findViewById<View>(R.id.view1).setOnClickListener {
            findViewById<View>(R.id.view2).setBackgroundColor(Color.RED);
        }


    */
}
//creer 3 fragement qui contiennent chacun des ecrans
