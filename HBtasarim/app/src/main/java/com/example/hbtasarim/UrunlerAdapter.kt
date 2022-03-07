package com.example.hbtasarim

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class UrunlerAdapter(var mContext: Context, var urunListesi: List<Urunler>) :
    RecyclerView.Adapter<UrunlerAdapter.CardViewHolder>() {


    inner class CardViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var cardViewUrun: CardView
        var imageViewUrun: ImageView
        var textViewUrun: TextView
        var  kampanyaRecycler : RecyclerView
        //var cardViewKampanya : CardView
      //  var imageViewKampanya : ImageView

        init {



            cardViewUrun = view.findViewById(R.id.cardViewUrun)
            imageViewUrun = view.findViewById(R.id.imageViewUrun)
            textViewUrun = view.findViewById(R.id.textViewUrun)
            kampanyaRecycler= view.findViewById(R.id.item_recycler)


        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.urunler_card, parent, false)
        return CardViewHolder(tasarim)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {

        val urun = urunListesi.get(position)
        holder.imageViewUrun.setImageResource(
            mContext.resources.getIdentifier(urun.urunResimAdi, "drawable", mContext.packageName)
        )

        holder.textViewUrun.text = urun.urunAdi

        setCatItemRecycler(holder.kampanyaRecycler,urunListesi[position].kampanyaListesi)


    }

    override fun getItemCount(): Int {
        return urunListesi.size
    }
    private fun  setCatItemRecycler(recyclerView: RecyclerView, kampanyalarListesi: List<Kampanyalar>){

        val itemRecyclerAdapter = KampanyalarAdapter(mContext,kampanyalarListesi)

        recyclerView.layoutManager = LinearLayoutManager(mContext,RecyclerView.HORIZONTAL,false)
        recyclerView.adapter = itemRecyclerAdapter



    }

}