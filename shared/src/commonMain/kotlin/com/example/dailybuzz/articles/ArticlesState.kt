package com.example.dailybuzz.articles

data class ArticlesState(
    val articles: List<Articles> = listOf(),
    val loading: Boolean = false,
    val error: String? = null
)
