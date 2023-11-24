package com.ninebits.todolistapp.repository

import com.ninebits.todolistapp.data.TaskDao
import com.ninebits.todolistapp.data.TaskEntity

class TaskRepository(private val taskDao: TaskDao) {

    suspend fun getAllTasks(): List<TaskEntity> {
        return taskDao.getAll()
    }

    suspend fun addSample() {
        taskDao.insert(TaskEntity(taskDescription = "do zrobienia", isDone = false))
    }

    suspend fun insertTask(task: TaskEntity) {
        taskDao.insert(task)
    }

    suspend fun deleteTask(task: TaskEntity) {
        taskDao.delete(task)
    }
}