package com.example.omsairam.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.omsairam.coderswag.Adapter.CategoryAdapter
import com.example.omsairam.coderswag.Model.Category
import com.example.omsairam.coderswag.R
import com.example.omsairam.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var adapter: CategoryAdapter

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //adapter is used as interface bw the data and the list view and format
        //it in same way

        adapter = CategoryAdapter(this,
                DataService.categories)
        categoryListView.adapter = adapter
    }
}
