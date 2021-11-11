package cours

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.halifa.myapplication.R

class ListItemViewHolder(v: View) : RecyclerView.ViewHolder(v) {

    val text1 = v.findViewById<TextView>(R.id.text1)
    val text2 = v.findViewById<TextView>(R.id.text2)


    fun bindDay(day:String) {
        text1.text = "Jour"
        text2.text = day
    }

}