package com.example.searchview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.widget.SearchView

class MainActivity : AppCompatActivity() {

    lateinit var searchView: SearchView
    lateinit var myList: ListView
    lateinit var list: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        searchView.findViewById<SearchView>(R.id.searchView)
        myList.findViewById<ListView>(R.id.myList)

        addDataList()
    }

    private fun addDataList(): ArrayList<String>{
        // add data
        list.add("Monday")
        list.add("Tuesday")
        list.add("Wednesday")
        list.add("Thursday")
        list.add("Friday")
        list.add("Saturday")
        list.add("Sunday")

        return list
    }
}
