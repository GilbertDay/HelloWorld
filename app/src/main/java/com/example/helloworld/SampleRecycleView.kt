package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.helloworld.adapter.PetaniAdapter
import com.example.helloworld.model.Petani

class SampleRecycleView : AppCompatActivity() {
    lateinit var rvSample : RecyclerView
    lateinit var petaniAdapter: PetaniAdapter
    lateinit var lPetani: List<Petani>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_recycle_view)

        rvSample = findViewById(R.id.rvLatihan)

        lPetani = listOf(
            Petani("P01", "Gilbert Day", "20", "50", "2"),
            Petani("P02", "Jordy Day", "200", "50", "21"),
            Petani("P03","Chris","200","50","21"),
            Petani("P04","Wahyu","200","50","21")
        )

        petaniAdapter = PetaniAdapter(lPetani)

        rvSample.apply {
            layoutManager = LinearLayoutManager(this@SampleRecycleView)
            adapter = petaniAdapter
        }
    }
}