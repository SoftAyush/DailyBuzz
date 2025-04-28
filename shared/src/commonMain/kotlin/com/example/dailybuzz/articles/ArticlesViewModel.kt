package com.example.dailybuzz.articles

import com.example.dailybuzz.BaseViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ArticlesViewModel : BaseViewModel() {
    private val _articlesState: MutableStateFlow<ArticlesState> = MutableStateFlow(ArticlesState(loading = true))

    val articlesState: StateFlow<ArticlesState> get() = _articlesState

    init {
        getArticles()
    }

    private fun getArticles() {
        scope.launch {
            val fetchedArticles =  fetchArticles()
            delay(500)

            _articlesState.emit(ArticlesState(articles = fetchedArticles))
        }
    }
    suspend fun fetchArticles(): List<Articles> = demoArticles


    private  val demoArticles = listOf(
        Articles(
            title = "There are signs Trump could be ready to retreat on tariffs",
            desc = "BBC economic editor Faisal Islam on what comes next for the US president's central economic policy.",
            date ="2025-04-28",
            imageUrl = "https://ichef.bbci.co.uk/news/1024/cpsprodpb/5ca9/live/256b8da0-21dd-11f0-9060-674316cb3a1f.png.webp",
        ),
        Articles(
            title = "Mount Fuji climber rescued twice after going back for lost phone",
            desc = "He returned to Mount Fuji four days after his initial rescue in the hopes of finding his phone.",
            date ="2025-04-28",
            imageUrl = "https://ichef.bbci.co.uk/news/1024/cpsprodpb/b127/live/71ea9600-23d9-11f0-936d-cde046edcc89.jpg.webp"
        ),
        Articles(
            title = "Greenland not a piece of property, says PM after Trump threats",
            desc = "Jens-Frederick Nielsen says the island must \"stand together\" with Denmark during a highly symbolic visit to Copenhagen.",
            date ="2025-04-28",
            imageUrl = "https://ichef.bbci.co.uk/news/1024/cpsprodpb/5b74/live/216d0650-237e-11f0-9a20-734d54da1b3c.jpg.webp"
        ),
    )


}