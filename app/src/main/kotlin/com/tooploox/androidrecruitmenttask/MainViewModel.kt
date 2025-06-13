package com.tooploox.androidrecruitmenttask

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Dispatchers

class MainViewModel : ViewModel() {

    private val apiService = ApiService()

    val songs: MutableStateFlow<List<Song>> = MutableStateFlow(emptyList())

    init {
        GlobalScope.launch(Dispatchers.IO) {
            val response = apiService.service.getSongs("post malone", 100)
            songs.value = response.songs.map { Song(it.trackName, it.artist) }  // This will crash
        }
    }
}
