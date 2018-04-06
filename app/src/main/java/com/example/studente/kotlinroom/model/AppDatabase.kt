package com.example.studente.kotlinroom.model

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context

/**
 * Created by studente on 06/04/2018.
 */
@Database(entities = arrayOf(Person::class), version=1)
abstract class AppDatabase :RoomDatabase() {

    abstract fun personDao():PersonDao

    companion object {
        var DB:AppDatabase?=null

        fun getInstance(context:Context):AppDatabase{
            if(DB==null)
                DB=Room.databaseBuilder(context,AppDatabase::class.java,"nomeDatabase").allowMainThreadQueries().build()
            return DB!!
        }

        fun getDatabase():AppDatabase{
            return DB!!
        }

        fun destroyInstance(){
            DB=null
        }
    }
}