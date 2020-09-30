package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalimage"),
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat1"),
            Product("Devslopes Hat Black", "$2", "hat2"),
            Product("Devslopes Hat White", "$18", "hat3"),
            Product("Devslopes Hat Snapback", "$22", "hat4"),
            Product("Devslopes Hat Snapback", "$22", "hat4"),
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
        Product("Devslopes Hoodie Red", "$32", "hoodie2"),
        Product("Devslopes Gray Hoodie", "$28", "hoodie3"),
        Product("Devslopes Black Hoodie", "$32", "hoodie4"),
        Product("Devslopes Black Hoodie", "$32", "hoodie4"),
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$18", "shirt1"),
        Product("Devslopes Badge Light Gray", "$20", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$22", "shirt3"),
        Product("Devslopes Hustle", "$22", "shirt4"),
        Product("Devslopes Kickflip Studio", "$18", "shirt5"),

        )

    val digitalGood : List<Product> = listOf()

    fun getProducts(category: String): List<Product> {

        return when (category)  {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }
}