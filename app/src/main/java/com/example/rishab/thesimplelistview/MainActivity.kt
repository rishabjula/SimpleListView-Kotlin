package com.example.rishab.thesimplelistview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ListView = Adapter + data source

        //DataSource :
        var namesArray : Array<String> = arrayOf("Rishab","Smrati","Rahul","krishnakant","Shantanu","Sakshi","Rohan","Vikram","Bob","Dave","Adam")


        //ArrayAdapter :

        var namesAdapter : ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,namesArray)

        listView.adapter = namesAdapter

        listView.setOnItemClickListener{parent, view, position, id ->

           var ItemName=  listView.getItemAtPosition(position).toString()

            Toast.makeText(this,"Name: $ItemName",Toast.LENGTH_LONG).show()
        }
    }
}
