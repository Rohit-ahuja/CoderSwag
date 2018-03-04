package com.example.omsairam.coderswag.Services

import com.example.omsairam.coderswag.Model.Category
import com.example.omsairam.coderswag.Model.Product

/**
 * Created by OM SAI RAM on 04-03-2018.
 */
object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats= listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat01"),
            Product("Devslopes Hat Black", "$20", "hat02"),
            Product("Devslopes Hat White", "$24", "hat03"),
            Product("Devslopes Hat Snapback", "$16", "hat04")
    )


    val hoodies= listOf(
            Product("Devslopes Hoodie Gray", "$18", "hoodie01"),
            Product("Devslopes Hoodie Red", "$20", "hoodie02"),
            Product("Devslopes Gray Hoodie", "$24", "hoodie03"),
            Product("Devslopes Black Hoodie", "$16", "hoodie04")
    )


    val shirts= listOf(
            Product("Devslopes Shirt Black", "$18", "shirt01"),
            Product("Devslopes Badge Light Gray", "$20", "shirt02"),
            Product("Devslopes Logo Shirt Red", "$24", "shirt03"),
            Product("Devslopes Hustle", "$16", "shirt04"),
            Product("Kickflip Studios", "$16", "shirt05")
    )

}