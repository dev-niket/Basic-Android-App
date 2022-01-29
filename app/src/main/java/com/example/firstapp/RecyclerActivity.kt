package com.example.firstapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class RecyclerActivity : AppCompatActivity() {
    /*
    Brief steps for creation of the RecyclerView
    1 - Add the data in the form of an array (here, countries).
        Note: There are many ways to declare data like adding strings to strings.xml. Data can also be fetched from a web service.
        Creating an array is one of the simplest ways, just to understand how to create a RecyclerView.
    2 - Create the Adapter class in a separate file and make it a sub-class of RecyclerView.Adapter
    3 - Create a separate Layout Resource file (XML) which will have the design of an individual list item (here, list_item.xml)
    4 - Override all abstract functions in the Adapter class, create the ViewHolder.
    5 - Inflate the necessary layout in the adapter (list_item) and return the necessary data from the overriden funtions.
    */

    var countries = arrayOf("Mexico", "Lebanon", "India", "Italy", "Japan", "UAE")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        val countriesRecyclerView = findViewById<RecyclerView>(R.id.countriesRView)

        val adapter = CountriesAdapter(countries)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        countriesRecyclerView.layoutManager = layoutManager
        countriesRecyclerView.adapter = adapter
    }
}