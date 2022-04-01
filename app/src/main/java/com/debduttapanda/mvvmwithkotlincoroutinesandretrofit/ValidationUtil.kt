package com.debduttapanda.mvvmwithkotlincoroutinesandretrofit

object ValidationUtil {

    fun validateMovie(movie: Movie) : Boolean {
        if (movie.name.isNotEmpty() && movie.category.isNotEmpty()) {
            return true
        }
        return false
    }
}