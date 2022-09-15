package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class HelpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        if (intent.extras != null){
            var bundle : Bundle ?= intent.extras
            var strTes : String = bundle?.getString("tesText").toString()

            //Toast
            Toast.makeText(this,strTes,Toast.LENGTH_LONG).show()
//            Snackbar.make(window.decorView.rootView,strTes,Snackbar.LENGTH_LONG).show()
        }
    }
}