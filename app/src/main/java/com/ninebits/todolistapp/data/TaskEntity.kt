package com.ninebits.todolistapp.data

import android.app.ActivityManager.TaskDescription
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Tasks")
data class TaskEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "task_description") val taskDescription: String,
    @ColumnInfo(name = "is_done") val isDone: Boolean
)
