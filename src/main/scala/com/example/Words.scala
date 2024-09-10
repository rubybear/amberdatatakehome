package com.example

import com.typesafe.scalalogging.LazyLogging
import upickle.default.*

case class Words(words: String) extends LazyLogging derives ReadWriter {
  def toProcessedWords: Option[ProcessedWords] = words match
    case w if w.isEmpty =>
      logger.error("Word value is empty")
      None
    case _ =>
      val listOfWords = words.split(" ")
      val wordCharacterCount = listOfWords.map { w =>
        characterCountLogger(w)
        w.length
      }
      val mapOfWords = (listOfWords zip wordCharacterCount).toMap
      val sortedWords = mapOfWords.filter { case (word, _) => word.length % 2 == 1 }.toList.sortBy(_._2)
      sortedWords.foreach(sortedWordLogger)
      Some(ProcessedWords(rawWords = words, mapOfWords = mapOfWords, sortedListOfWordWithOddCounts = sortedWords))

  def characterCountLogger(word: String): Unit = word.length match {
    case wordLen if wordLen % 2 == 1 => logger.info(s"Word: $word, with odd character count: ${word.length}")
    case _ => logger.info(s"Word: $word, Character count: ${word.length}")
  }

  def sortedWordLogger(sortedWord: (String, Int)): Unit = {
    logger.info(s"Odd character words sorted in ascending order: $sortedWord")
  }
}