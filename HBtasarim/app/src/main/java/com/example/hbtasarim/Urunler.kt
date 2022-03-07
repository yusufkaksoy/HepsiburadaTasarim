package com.example.hbtasarim

import java.io.Serializable

data class Urunler(
    var urunId: Int ,
    var urunAdi: String,
    var urunResimAdi: String,
    var kampanyaListesi:List<Kampanyalar>
    ) : Serializable {}
