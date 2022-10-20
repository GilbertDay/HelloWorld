package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ServiceActivity : AppCompatActivity() {
    lateinit var btnInsert : Button
    lateinit var btnGet : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)

        btnInsert = findViewById(R.id.btnInsertAPI)
        btnInsert.setOnClickListener(View.OnClickListener { view ->
            val intent = Intent(this@ServiceActivity, InsertMhsActivity::class.java)
            startActivity(intent)
        })

        btnGet = findViewById(R.id.btnGetAPI)
        btnGet.setOnClickListener(View.OnClickListener { view ->
            val intent = Intent(this@ServiceActivity, GetMhsActivity::class.java)
            startActivity(intent)
        })
    }


}