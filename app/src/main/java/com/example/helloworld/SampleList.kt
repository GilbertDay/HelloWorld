package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ListView

class SampleList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var btnList : Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_list)

        btnList = findViewById(R.id.btnShowList)
        btnList.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@SampleList, SampleListView::class.java)
            startActivity(intent)
        })

    }
}