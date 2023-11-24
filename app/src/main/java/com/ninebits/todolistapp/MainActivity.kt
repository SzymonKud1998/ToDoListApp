package com.ninebits.todolistapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.room.Room
import com.ninebits.todolistapp.data.TaskDatabase
import com.ninebits.todolistapp.ui.theme.ToDoListAppTheme
import com.ninebits.todolistapp.ui.theme.ToDoScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ToDoListAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    val database =
//                        Room.databaseBuilder(applicationContext, TaskDatabase::class.java, "taskDB").build()
                    ToDoScreen()
                }
            }
        }
    }
}
