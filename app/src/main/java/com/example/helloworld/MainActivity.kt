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
    lateinit var btnLinear : Button
    lateinit var btnConstraint : Button
    lateinit var btnTable : Button
    lateinit var btnRecycleView : Button
    lateinit var btnCardView : Button

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

        //Pindah Linear
        btnLinear = findViewById(R.id.btn_linear)
        btnLinear.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@MainActivity, TestLinear::class.java)
            startActivity(intent)
        })

        //Pindah Constraint
        btnConstraint = findViewById(R.id.btn_constraint)
        btnConstraint.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@MainActivity, ConstraintActivity::class.java)
            startActivity(intent)
        })

        //Pindah Table
        btnTable = findViewById(R.id.btn_table)
        btnTable.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@MainActivity, TableActivity::class.java)
            startActivity(intent)
        })

        //Recycle View
        btnRecycleView = findViewById(R.id.btn_recycler_view)
        btnRecycleView.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@MainActivity, SampleRecycleView::class.java)
            startActivity(intent)
        })

        //Card View
        btnCardView = findViewById(R.id.btn_card_view)
        btnCardView.setOnClickListener(View.OnClickListener { view ->
            var intent = Intent(this@MainActivity, SampleCardView::class.java)
            startActivity(intent)
        })
    }
}