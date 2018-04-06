package com.example.studente.kotlinroom

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.studente.kotlinroom.model.Adapter
import com.example.studente.kotlinroom.model.AppDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppDatabase.getInstance(context = this)

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=LinearLayoutManager(this) //aggiungtere il new su Java
        recyclerView.adapter=Adapter()

    }
}
