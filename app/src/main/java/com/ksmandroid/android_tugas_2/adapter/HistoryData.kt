package com.ksmandroid.android_tugas_2.adapter

import java.util.*

object FruitData {
    var data = arrayOf(
        arrayOf(
            "Pepaya",
            "Vitamin C dan Provitamin A",
            "https://infobuah.com/wp-content/uploads/2018/08/Pepaya.jpg"
        ),
        arrayOf(
            "Pisang",
            "Vitamin A, B1, B2 dan C",
            "https://infobuah.com/wp-content/uploads/2018/11/Pisang-ambon.jpg"
        ),
        arrayOf(
            "Mangga",
            "Vitamin A, E dan C",
            "https://doktersehat.com/wp-content/uploads/2018/05/doktersehat-buah-mangga-1024.jpg"
        ),
        arrayOf(
            "Strawberry",
            "Provitamin A, vitamin B1, B dan C",
            "https://doktersehat.com/wp-content/uploads/2012/01/Anna-Peaches.jpg"
        ),
        arrayOf(
            "Apel",
            "Vitamin A, B dan C",
            "https://infobuah.com/wp-content/uploads/2018/11/Buah-Apel.jpg"
        ),
        arrayOf(
            "Jeruk",
            "Vitamin A, B1, B2 dan C",
            "https://infobuah.com/wp-content/uploads/2018/08/Buah-Jeruk-Sunkist.jpg"
        ),
        arrayOf(
            "Semangka",
            "Vitamin C dan provitamin A",
            "https://infobuah.com/wp-content/uploads/2018/11/Buah-Semangka-compressed.jpg"
        )
    )
    val listData: ArrayList<Fruit>
        get() {
            var fruit: Fruit? = null
            val list = ArrayList<Fruit>()
            for (aData in data) {
                fruit = Fruit()
                fruit.setName(aData[0])
                fruit.setComposition(aData[1])
                fruit.setPhoto(aData[2])
                list.add(fruit)
            }
            return list
        }
}
