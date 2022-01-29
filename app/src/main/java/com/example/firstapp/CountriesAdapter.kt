package com.example.firstapp


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CountriesAdapter(var mCountries: Array<String>) :
    RecyclerView.Adapter<CountriesAdapter.CountriesViewHolder>() {
    @Override
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountriesViewHolder {
        //return null
        val rowPlank: View =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CountriesViewHolder(rowPlank)
    }

    @Override
    override fun onBindViewHolder(holder: CountriesViewHolder, position: Int) {
        holder.rowTextView.text = mCountries[position]
    }

    @Override
    override fun getItemCount(): Int {
        return mCountries.size
    }

    class CountriesViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var rowTextView: TextView

        init {
            rowTextView = itemView.findViewById(R.id.tvRow)
        }
    }
}