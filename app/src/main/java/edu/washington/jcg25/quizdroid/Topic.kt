package edu.washington.jcg25.quizdroid

data class Topic(val title: String, val shortDescription: String, val longDescription: String, val questions: List<Question>)