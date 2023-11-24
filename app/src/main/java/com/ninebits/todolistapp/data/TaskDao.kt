package com.ninebits.todolistapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.RoomDatabase

@Dao
interface TaskDao {
    @Query("Select * FROM Tasks")
    suspend fun getAll(): List<TaskEntity>

    @Insert
    suspend fun insert(task: TaskEntity)

    @Delete
    suspend fun delete(task: TaskEntity)
}

abstract class TaskDatabase: RoomDatabase(){
    abstract fun taskDao(): TaskDao
}