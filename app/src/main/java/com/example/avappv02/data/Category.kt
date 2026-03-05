package com.example.avappv02.data

data class Category(
    val id: Int,
    val name: String,
    val subCategories: List<SubCategory>
)
