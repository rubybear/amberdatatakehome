package com.example

case class ProcessedWords(rawWords: String, mapOfWords: Map[String, Int], sortedListOfWordWithOddCounts: List[(String, Int)])

object ProcessedWords {
  def create(rawWords: String, mapOfWords: Map[String, Int], sortedListOfWordWithOddCounts: List[(String, Int)]): Option[ProcessedWords] = {
    val validatedMap = mapOfWords.map { case (key, value) =>
      key.trim -> value
    }

    if (validatedMap.keys.forall(_.nonEmpty)) { // Additional check for empty keys after trimming
      Some(new ProcessedWords(rawWords, validatedMap, sortedListOfWordWithOddCounts))
    } else {
      None // Validation failed
    }
  }
}
