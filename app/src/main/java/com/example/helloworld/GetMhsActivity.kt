package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.helloworld.adapter.MahasiswaAdapter
import com.example.helloworld.model.DataMahasiswaItem
import com.example.helloworld.network.NetworkConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GetMhsActivity : AppCompatActivity() {
    lateinit var rvUser : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_apiactivity)
        rvUser = findViewById(R.id.rvApiUserBaru)
        NetworkConfig().getService().getMahasiswa().enqueue(object : Callback<List<DataMahasiswaItem>> {
            override fun onFailure(call: Call<List<DataMahasiswaItem>>, t: Throwable) {
                Toast.makeText(this@GetMhsActivity, t.localizedMessage, Toast.LENGTH_SHORT).show()
            }
            override fun onResponse(
                call: Call<List<DataMahasiswaItem>>,
                response: Response<List<DataMahasiswaItem>>
            ) {
                rvUser.apply{
                    layoutManager = LinearLayoutManager(this@GetMhsActivity)
                    adapter = MahasiswaAdapter(response.body())
                }
            }
        })
        registerForContextMenu(rvUser)

    }

}