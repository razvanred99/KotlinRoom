package com.example.studente.kotlinroom.model

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

/**
 * Created by studente on 06/04/2018.
 */
@Dao
interface PersonDao {

    @Query("SELECT * FROM People")
    fun getAll():List<Person>

    @Query("SELECT * FROM People WHERE id= :id")
    fun getById(id:Int):Person

    @Query("SELECT COUNT(*) FROM People")
    fun countPeople():Int

    //@Insert

}