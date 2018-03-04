package com.example.omsairam.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.omsairam.coderswag.Model.Category
import com.example.omsairam.coderswag.R
import com.example.omsairam.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var adapter: ArrayAdapter<Category>

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //adapter is used as interface bw the data and the list view and format
        //it in same way

        adapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_1,DataService.categories)
        categoryListView.adapter = adapter
    }
}
