package com.example

import upickle.default.*
import com.typesafe.scalalogging.LazyLogging

case class Words(words: String) extends LazyLogging derives ReadWriter {
  def toProcessedWords: Option[ProcessedWords] = {
    if (words == "") {
      logger.error("Word value is empty")
      None
    }
    else {
      val listOfWords = words.split(" ")
      val wordCharacterCount = listOfWords.map(characterCount)
      val mapOfWords = (listOfWords zip wordCharacterCount).toMap
      val sortedWords = mapOfWords.filter(_._1.length % 2 == 1).toList.sortBy(_._2)
      sortedWords.foreach(l => logger.info(s"Odd character words sorted in ascending order: $l"))
      Some(ProcessedWords(rawWords = words, mapOfWords = mapOfWords, sortedListOfWordWithOddCounts = sortedWords))
    }
  }

  def characterCount(word: String): Int = {
    val charCount = word.length
    logger.info(s"Word: $word, Character count: $charCount")
    if (charCount % 2 == 1) logger.info(s"Word: $word, with odd character count: $charCount")
    charCount
  }
}