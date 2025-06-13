package com.tooploox.androidrecruitmenttask

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun SongsScreen() {
    val viewModel: MainViewModel = viewModel()
    val songs by viewModel.songs.collectAsState()
    Column {
        songs.forEach {
            Column {
                Text(it.artist)
                Text(it.title)
            }
        }
    }
}
