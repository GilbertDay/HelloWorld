package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvMain : TextView
    lateinit var btnInput : Button
    lateinit var editInputNama : EditText
    lateinit var btnHelp : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMain = findViewById(R.id.tv_main_activity)
        tvMain.text = getString(R.string.text_progmob)

        btnInput = findViewById(R.id.btn_ambil_nama)
        editInputNama = findViewById(R.id.ed_input_nama)

        //Tampilkan Teks
        btnInput.setOnClickListener(View.OnClickListener { view ->
            var strTmp = editInputNama.text.toString()
            tvMain.setText(strTmp)
        })

        //Pindah Halaman
        btnHelp = findViewById(R.id.btn_help)
        btnHelp.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var strTmp = editInputNama.text.toString()
            bundle.putString("tesText", strTmp)

            var intent = Intent(this@MainActivity, HelpActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        })
    }
}