package com.kvrae.coffeemasters.data

class Product(var id: Int, var name: String, var price: Double, var Image: String){

    val imageUrl get() = "https://firtman.github.io/coffeemasters/api/images/${this.Image}"
}

class Category(var name : String, products: MutableList<Product>)

class ItemCart(var product: Product, quatity: Int)