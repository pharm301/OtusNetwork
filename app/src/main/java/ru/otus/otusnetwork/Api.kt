package ru.otus.otusnetwork

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie?sort_by=popularity.desc&api_key=04bab194090e8ae26826b3af916e0d92&language=ru-RU&page=1")
    fun getFilms(): Call<Root>

    @GET("films?id=1&name=blabla")
    fun getFilmById(@Query("image") id: String, @Query("name") name:String): Call<FilmModel>
}