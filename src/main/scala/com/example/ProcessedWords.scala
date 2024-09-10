package com.example

case class ProcessedWords(rawWords: String, mapOfWords: Map[String, Int], sortedListOfWordWithOddCounts: List[(String, Int)])

object ProcessedWords {
  def create(rawWords: String, mapOfWords: Map[String, Int], sortedListOfWordWithOddCounts: List[(String, Int)]): Option[ProcessedWords] = {
    val validatedMap = mapOfWords.map { case (key, value) =>
      key.trim -> value
    }

    validatedMap.keys.forall(_.nonEmpty) match {
      case true => Some(new ProcessedWords(rawWords, validatedMap, sortedListOfWordWithOddCounts))
      case false => None // Validation failed
    }
  }
}
