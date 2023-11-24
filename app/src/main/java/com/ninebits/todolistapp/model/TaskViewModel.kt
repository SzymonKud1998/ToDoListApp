package com.ninebits.todolistapp.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ninebits.todolistapp.data.TaskEntity
import com.ninebits.todolistapp.repository.TaskRepository
import kotlinx.coroutines.launch


class TaskViewModel(private val taskRepository: TaskRepository) : ViewModel() {

    fun fetchData(){
        viewModelScope.launch{
            val allTasks: List<TaskEntity> = taskRepository.getAllTasks()
        }
    }


}