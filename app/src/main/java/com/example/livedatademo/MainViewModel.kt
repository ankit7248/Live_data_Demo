package com.example.livedatademo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainViewModel : ViewModel() {

    val factsLiveData = MutableLiveData<String>("This is a fact")

    fun UpdateLiveData(){
        factsLiveData.value = "Another Fact"
    }
}