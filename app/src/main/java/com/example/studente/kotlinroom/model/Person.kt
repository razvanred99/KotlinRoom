package com.example.studente.kotlinroom.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by studente on 06/04/2018.
 */

@Entity(tableName = "People")
class Person(@PrimaryKey var id: Int,
             var name: String,
             var surname: String,
             var age: Int)