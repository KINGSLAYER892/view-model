package com.example.ejemplo_view_model

class QuoteProvider {
    companion object {
        fun random(): QuoteModel{
            val position = (0..3).random()
            return quote[position]
        }
      private  val quote = listOf<QuoteModel>(
          QuoteModel(
              quote = "HOLA",
              author = "desconocido"
          ),
          QuoteModel(
              quote = "ADIOS",
              author = "desconocido"
          ),
          QuoteModel(
              quote = "¿Cómo estas?",
              author = "desconocido"
          ),
          QuoteModel(
              quote = "busca soluciones.",
              author = "desconocido"
          ),
          QuoteModel(
              quote = "BUENAS TARDES",
              author = "desconocido"
          ),
          QuoteModel(
              quote = "la vida es cara",
              author = "desconocido"
          ),

      )

    }
}