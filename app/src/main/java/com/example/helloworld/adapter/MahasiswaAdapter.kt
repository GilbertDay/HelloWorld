package com.example.helloworld.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.PopupMenu
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.helloworld.R
import com.example.helloworld.model.DataMahasiswaItem
import com.google.android.material.snackbar.Snackbar

class MahasiswaAdapter(val mhs: List<DataMahasiswaItem>?):
    RecyclerView.Adapter<MahasiswaAdapter.MhsHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,

    ): MahasiswaAdapter.MhsHolder {
        return MhsHolder(

            LayoutInflater.from(parent.context).inflate(R.layout.rv_mhs_api, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MahasiswaAdapter.MhsHolder, position: Int) {
        holder.bindMhs(mhs?.get(position))
    }

    override fun getItemCount(): Int {
        return mhs?.size ?: 0
    }

    class MhsHolder(view: View) : RecyclerView.ViewHolder(view) {


        init{
            view.setOnLongClickListener {
                val pop= PopupMenu(view.context,it)
                pop.inflate(R.menu.menu_sample_list_view)

                pop.setOnMenuItemClickListener {item->
                    var info = item.menuInfo as AdapterView.AdapterContextMenuInfo
                    when(item.itemId)
                    {
                        R.id.menu_delete->{
                            Snackbar.make(view,"Anda memilih: Add Item ke - ${info.id}",
                            Snackbar.LENGTH_LONG).show()
                        }
                    }
                    true
                }
                pop.show()
                true
            }
        }

        lateinit var txtNim: TextView
        lateinit var txtNama: TextView
        lateinit var txtfoto: TextView
        lateinit var txtEmail: TextView
        lateinit var txtAlamat: TextView
        fun bindMhs(mhs: DataMahasiswaItem?) {
            itemView.apply {
                txtNim = findViewById(R.id.nim)
                txtNama = findViewById(R.id.namaMhs)
                txtfoto = findViewById(R.id.foto)
                txtEmail = findViewById(R.id.email)
                txtAlamat = findViewById(R.id.alamatMhs)
                txtNim.text = mhs?.nim
                txtNama.text = mhs?.nama
                txtfoto.text = mhs?.foto
                txtEmail.text = mhs?.email
                txtAlamat.text = mhs?.alamat
            }
        }
    }
}