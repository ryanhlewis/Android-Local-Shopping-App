/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.dogglers.data

import com.example.dogglers.R
import com.example.dogglers.model.Product

/**
 * An object to generate a static list of dogs
 */
object DataSource {

    /** TODO LIST---
     *
     * Rename all variables so names are clear~
     *
     * Add multiple images per Product- one cover, rest are somehow shown on product page.
     * Add description of item to be shown on product page.
     *
     * Add Add To Cart Buttons (on product page)
     *
     * Add item "type" so items can be sorted easily in categories.
     *
     */
    var chosenArray : MutableList<Product> = mutableListOf()

    var chosenProduct: MutableList<Product> = mutableListOf()

    var cart: MutableList<Product> = mutableListOf(
    )

    val products: MutableList<Product> = mutableListOf(
        Product(
            R.drawable.samsung21,
            "Samsung Galaxy S21 FE 5G Cell Phone, Factory Unlocked Android Smartphone, 128GB, 120Hz Display, Pro Grade Camera, All Day Intelligent Battery, US Version, Olive",
            "Sal's Tech Shop",
            "450"
        ),
        Product(
            R.drawable.iphone11,
            "Apple iPhone 11 Pro, US Version, 64GB, Silver - Unlocked",
            "Sal's Tech Shop",
            "430"
        ),
        Product(
            R.drawable.theevery,
            "The Every: A Novel by Dave Eggers, Award-Winning Author of The Circle",
            "Book Haven",
            "10"
        ),
        Product(
            R.drawable.unknownwoman,
            "Portrait of an Unknown Woman: A Novel by Daniel Silva",
            "Book Haven",
            "15"
        ),
        Product(
            R.drawable.boots,
            "Hand-Crafted Custom Fit Boots, Weatherized & Iron Toe Tips Included",
            "Shoe Creator",
            "235"
        ),
        Product(
            R.drawable.dressshoes,
            "Hand-Crafted Crocodile-Pattern Leather Dress Shoes",
            "Shoe Creator",
            "130"
        )
    )
}
