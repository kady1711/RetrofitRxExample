package com.example.retrofitrxexample.network

import android.sax.ElementListener
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroService {
    @GET("posts")
     fun getElementListFromApi(): Observable<ElementListModel>
}