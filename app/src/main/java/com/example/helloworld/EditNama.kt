package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class EditNama : AppCompatActivity() {
    lateinit var editNama : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nama)
        editNama = findViewById(R.id.editNama)
        var namaList = intent.getStringExtra("nama")
        editNama.text = namaList
    }
}