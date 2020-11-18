package com.example.neopetcarev1


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class AdaptadorCustom(items:ArrayList<MascotaModelos>): RecyclerView.Adapter<AdaptadorCustom.ViewHolder>() {

    var items:ArrayList<MascotaModelos>? = null
    var viewHolder: ViewHolder? = null

    init{
        this.items = items
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vista = LayoutInflater.from(parent?.context).inflate(R.layout.iten_mascota,parent,false)

        viewHolder = ViewHolder(vista)
        return viewHolder!!
    }

    override fun onBindViewHolder(holder: AdaptadorCustom.ViewHolder, position: Int) {
        val item = items?.get(position)
        holder.nombre?.text = item?.nombre
        holder.edad?.text = item?.edad

        holder.foto?.setImageResource(item?.foto!!)

    }

    override fun getItemCount(): Int {
        return this.items?.count()!!

    }


    class ViewHolder(vista:View):RecyclerView.ViewHolder(vista) {
        var vista = vista
        var foto: ImageView? = null
        var nombre:TextView? = null
        var edad:TextView? = null

        init {
            foto = vista.findViewById(R.id.foto_Mascota)
            nombre = vista.findViewById(R.id.txtMascota)
            edad = vista.findViewById(R.id.txtEdad)
        }
    }

}