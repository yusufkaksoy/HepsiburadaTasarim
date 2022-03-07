package com.example.hbtasarim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.hbtasarim.databinding.FragmentAnasayfaBinding
import kotlinx.android.synthetic.main.fragment_anasayfa.*


class AnasayfaFragment : Fragment() {
    private lateinit var tasarim : FragmentAnasayfaBinding



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater,container,false)
        tasarim.rv.layoutManager=StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)

        val categoryItemList : MutableList<Kampanyalar> = ArrayList()
        categoryItemList.add(Kampanyalar(1,"YUSUF",R.drawable.temizlik))



        val urunListesi = ArrayList<Urunler>()
        val u1 = Urunler(1,"Fırsat Ürünleri","firsat",categoryItemList)
        val u2 = Urunler(2,"Temel Gıda","temelgida",categoryItemList)
        val u3 = Urunler(3,"Fit & Sağlıklı","fitsaglik",categoryItemList)
        val u4 = Urunler(4,"Atıştırmalık","cips",categoryItemList)
        val u5 = Urunler(5,"Çay & Kahve","kahve",categoryItemList)
        val u6 = Urunler(6,"Deterjanlar","deterjan",categoryItemList)
        val u7 = Urunler(7,"Ev Temizlik Ürünleri","temizlik",categoryItemList)
        val u8 = Urunler(8,"Sağlık & Kozmetik","saglikkozmetik",categoryItemList)
        val u9 = Urunler(9,"Kişisel Bakım ","kisiselbakim",categoryItemList)
        val u10 = Urunler(10,"Bebek Bezi & Bebek Bakım","bebekbakim",categoryItemList)
        val u11 = Urunler(11,"Bebek Mamaları","bebekmamasi",categoryItemList)
        val u12 = Urunler(12,"Kitap ve Kırtasiye","kitap",categoryItemList)
        urunListesi.add(u1)
        urunListesi.add(u2)
        urunListesi.add(u3)
        urunListesi.add(u4)
        urunListesi.add(u5)
        urunListesi.add(u6)
        urunListesi.add(u7)
        urunListesi.add(u8)
        urunListesi.add(u9)
        urunListesi.add(u10)
        urunListesi.add(u11)
        urunListesi.add(u12)


        val adapter = UrunlerAdapter(requireContext(),urunListesi)
     /*   tasarim.rv.adapter=adapter
      //  tasarim.rv2.layoutManager=StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        val kampanyaListesi = ArrayList<Kampanyalar>()
        val k1 = Kampanyalar(1,"kitap")
        val k2 =Kampanyalar(2,"kahve")
        val k3 =Kampanyalar(3,"cips")
        kampanyaListesi.add(k1)
        kampanyaListesi.add(k2)
        kampanyaListesi.add(k3)
        val adapterKampanya = KampanyalarAdapter(requireContext(),kampanyaListesi)
        //tasarim.rv2.adapter=adapterKampanya*/





        return tasarim.root
    }
    private fun  setMainCategoryRecycler(kampanyalar: List<Kampanyalar>){







    }



}