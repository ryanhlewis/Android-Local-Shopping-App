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
        Product(
            R.drawable.samsung21, R.string.samsumg21_2, R.string.samsung21_2_store, R.string.samsung21_2_price)
        )

    val products: MutableList<Product> = mutableListOf(
        Product(
            R.drawable.samsung21, R.string.samsumg21_2, R.string.samsung21_2_store, R.string.samsung21_price),
        Product(
            R.drawable.iphone11, R.string.iphone11_2, R.string.iphone11_2_store, R.string.iphone11_2_price),

        Product(
            R.drawable.theevery, R.string.theevery_2, R.string.theevery_2_store, R.string.theevery_2_price),

        Product(
            R.drawable.unknownwoman, R.string.unknownwoman_2, R.string.unknownwoman_2_store, R.string.unknownwoman_2_price),

        Product(
            R.drawable.boots_1, R.string.boots_2, R.string.boots_2_store, R.string.boots_2_price),

        Product(
            R.drawable.dressshoes, R.string.dressshoes_2, R.string.dressshoes_2_store, R.string.dressshoes_2_price)
    )
    var shoeArray : MutableList<Product> = mutableListOf(
        Product(R.drawable.nike, R.string.nike, R.string.nike_store, R.string.nike_price),
        Product(R.drawable.hoka, R.string.hoka, R.string.hoka_store, R.string.hoka_price),
        Product(R.drawable.newbalance, R.string.new_balance, R.string.new_balance_store, R.string.new_balance_price),
        Product(R.drawable.boots_1, R.string.boots, R.string.boots_store, R.string.boots_price) ,
        Product(R.drawable.dressshoes, R.string.dress_shoes, R.string.dress_shoes_store, R.string.dress_shoes_price))

    var phoneArray : MutableList<Product> = mutableListOf(
        Product(R.drawable.iphone11, R.string.iphone11, R.string.iphone11_store, R.string.iphone11_price),
        Product(R.drawable.iphone13, R.string.hoka, R.string.hoka_store, R.string.hoka_price),
        Product(R.drawable.pixel6, R.string.new_balance, R.string.new_balance_store, R.string.new_balance_price),
        Product(R.drawable.samsung21, R.string.boots, R.string.boots_store, R.string.boots_price) ,
        Product(R.drawable.samsung22, R.string.dress_shoes, R.string.dress_shoes_store, R.string.dress_shoes_price))


    var bookArray : MutableList<Product> = mutableListOf(
        Product(R.drawable.theevery, R.string.the_every, R.string.the_every_store, R.string.the_every_price),
        Product(R.drawable.mockingbird, R.string.mockingbird, R.string.mockingbird_store, R.string.mockingbird_price),
        Product(R.drawable.pride, R.string.pride, R.string.pride_store, R.string.pride_store),
        Product(R.drawable.unknownwoman, R.string.unknownwoman, R.string.unknownwoman_store, R.string.unknownwoman_price) ,
        Product(R.drawable.wind, R.string.wind, R.string.wind_store, R.string.wind_price))

    }



