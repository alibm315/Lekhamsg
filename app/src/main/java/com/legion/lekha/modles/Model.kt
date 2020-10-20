package com.legion.lekha.modles

data class Hobby(var title: String)
object Supplier {

     val hobbies = listOf<Hobby>(
         Hobby("reading"),
         Hobby("wirtting"),
         Hobby("frogramming"),
         Hobby("krump"),
         Hobby("grumping"),
         Hobby("nagging")
     )

}