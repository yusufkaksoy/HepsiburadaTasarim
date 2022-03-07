package com.example.hbtasarim



import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class KampanyalarAdapter(var mContext : Context,var kampanyaListesi:List<Kampanyalar>)
    : RecyclerView.Adapter<KampanyalarAdapter.ImageViewHolder>() {

    inner class ImageViewHolder(view: View):RecyclerView.ViewHolder(view)
    {

        var imageViewKampanya : ImageView


        init {


            imageViewKampanya =view.findViewById(R.id.kampanya_item)

        }



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.rv_kampanya_item,parent,false)
        return ImageViewHolder(tasarim)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {

        holder.imageViewKampanya.setImageResource(kampanyaListesi[position].resimUrl)






    }

    override fun getItemCount(): Int {
        return kampanyaListesi.size
    }


}