package com.example.simplelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview=findViewById<ListView>(R.id.ListView)
        val countries= arrayOf("Kenya","Tanzania","Rwanda","Burundi","Ethiopia","Uganda")
        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,countries)
        listview.adapter=arrayAdapter


        listview.setOnItemClickListener { adapterview, view, position, l ->
            Toast.makeText(this,"You have clicked on " +countries[position],Toast.LENGTH_LONG).show()



        }
    }
}