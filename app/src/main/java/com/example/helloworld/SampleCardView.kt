package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.helloworld.adapter.PetaniCVAdapter
import com.example.helloworld.model.Petani

class SampleCardView : AppCompatActivity() {
    lateinit var cvSample : RecyclerView
    lateinit var petaniCVAdapter: PetaniCVAdapter
    lateinit var lPetani: List<Petani>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_card_view)

        cvSample = findViewById(R.id.rvCardView)

        lPetani = listOf(
            Petani("P01", "Gilbert Day", "20", "50", "2"),
            Petani("P02", "Jordy Day", "200", "50", "21"),
            Petani("P03","Chris","200","50","21"),
            Petani("P04","Wahyu","200","50","21")
        )

        petaniCVAdapter = PetaniCVAdapter(lPetani)

        cvSample.apply {
            layoutManager = LinearLayoutManager(this@SampleCardView)
            adapter = petaniCVAdapter
        }
    }
}