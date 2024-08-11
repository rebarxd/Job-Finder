package com.example.jobfinder.ViewModel

import androidx.lifecycle.ViewModel
import com.example.jobfinder.Repository.MainRepository

class MainViewModel(val repository: MainRepository):ViewModel() {
    constructor():this(MainRepository())

    fun loadLocation()=repository.location

    fun loadCategory()=repository.category

    fun loadData()=repository.items
}