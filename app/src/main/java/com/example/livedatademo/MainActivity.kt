package com.example.livedatademo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val factTextView : TextView
    get() = findViewById(R.id.factsTextView)

    private val btnUpdate : Button
    get() = findViewById(R.id.btnUpdate)

    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.factsLiveData.observe(this, Observer {
             factsTextView.text = it
        })
        btnUpdate.setOnClickListener{
            mainViewModel.UpdateLiveData()
            Log.d("hello","HELLO BROTHER")
        }
    }
}