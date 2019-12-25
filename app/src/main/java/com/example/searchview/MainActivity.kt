package com.example.searchview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.widget.SearchView

class MainActivity : AppCompatActivity() {

    lateinit var searchView: SearchView
    lateinit var myList: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        searchView.findViewById<SearchView>(R.id.searchView)
        myList.findViewById<ListView>(R.id.myList)
    }
}
