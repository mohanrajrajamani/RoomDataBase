package com.example.mindnotix.roomdatabase.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.mindnotix.roomdatabase.entity.Task;
import com.example.mindnotix.roomdatabase.dao.TaskDao;

@Database(entities = {Task.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TaskDao taskDao();
}