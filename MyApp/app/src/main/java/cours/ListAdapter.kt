package cours

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.halifa.myapplication.R

class ListAdapter(val days: List<String>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        // c/c
        return ListItemViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.list_cell, parent, false)
        )
    }

    override fun onBindViewHolder(
        holder: RecyclerView.ViewHolder,
        position: Int
    ) {
        val item = holder as ListItemViewHolder
        item.bindDay(days[position])
    }

    override fun getItemCount(): Int {
        return days.size
    }

}