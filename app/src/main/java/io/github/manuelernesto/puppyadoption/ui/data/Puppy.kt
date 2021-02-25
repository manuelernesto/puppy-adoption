package io.github.manuelernesto.puppyadoption.ui.data

import androidx.annotation.ColorRes
import io.github.manuelernesto.puppyadoption.R

data class Puppy(
    val name: String,
    val category: String,
    val description: String,
    val age: String,
    val fav: Int,
    val img: Int,
    val bgImg: Int,
    @ColorRes val color: Int,
    @ColorRes val bgColor: Int,
)

val puppies = listOf(
    Puppy(
        "Mandy",
        "Greyhound",
        description = "Taking care of a pet is my favorite, it helps me to...",
        img = R.mipmap.greyhound,
        bgImg = R.mipmap.greyhound_large,
        color = R.color.color_primary_1,
        bgColor = R.color.color_secondary_1,
        fav = R.drawable.ic_baseline_favorite_24,
        age = "1 year old"
    ), Puppy(
        "Ruby",
        "Dobermann",
        description = "Taking care of a pet is my favorite, it helps me to...",
        img = R.mipmap.dobermann,
        bgImg = R.mipmap.dobermann_large,
        color = R.color.color_primary_2,
        bgColor = R.color.color_secondary_2,
        fav = R.drawable.ic_baseline_favorite_border_24,
        age = "2 year old"
    ),
    Puppy(
        "Jupiter",
        "Pomeranian",
        description = "Taking care of a pet is my favorite, it helps me to...",
        img = R.mipmap.pomeranian,
        bgImg = R.mipmap.pomeranian_large,
        color = R.color.color_primary_3,
        bgColor = R.color.color_secondary_3,
        fav = R.drawable.ic_baseline_favorite_24,
        age = "1 year old"
    )
)