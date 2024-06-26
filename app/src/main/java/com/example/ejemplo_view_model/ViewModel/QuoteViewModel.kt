package com.example.ejemplo_view_model.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ejemplo_view_model.QuoteModel
import com.example.ejemplo_view_model.QuoteProvider

class QuoteViewModel : ViewModel() {
    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote : QuoteModel = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}