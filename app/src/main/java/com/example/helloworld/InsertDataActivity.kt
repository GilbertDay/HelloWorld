package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.helloworld.model.ResponseAddMahasiswaItem

class InsertDataActivity : AppCompatActivity() {
    lateinit var txtNim : EditText
    lateinit var txtNama : EditText
    lateinit var txtEmail :EditText
    lateinit var txtAlamat: EditText
    lateinit var txtNimProgmob : EditText
    lateinit var btnPost : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert_data)
        txtNim = findViewById(R.id.txtNim)
        txtNama = findViewById(R.id.txtNama)
        txtEmail = findViewById(R.id.txtEmail)
        txtAlamat = findViewById(R.id.txtAlamat)
        txtNimProgmob = findViewById(R.id.txtNimProgmob)
        btnPost = findViewById(R.id.btnpost)

        btnPost.setOnClickListener(View.OnClickListener { view ->
            val nim = txtNim.text.toString()
            val nama = txtNama.text.toString()
            val email = txtEmail.text.toString()
            val alamat = txtAlamat.text.toString()
            val nim_progmob = txtNimProgmob.text.toString()

            val postservice = PostApiService()
            val MhsData = ResponseAddMahasiswaItem(id = null,
                nim = nim, nama = nama, email = email, alamat = alamat, nim_progmob = nim_progmob)

            postservice.addMhs(MhsData){
                if(ResponseAddMahasiswaItem().id != null){
                    println("Success")
                }else{
                    println("error")
                }
            }
        })
    }
}