package com.example

import org.scalatest.funsuite.AnyFunSuiteLike

class WordsTest extends AnyFunSuiteLike {

  test("toProcessedWords should correctly process words with mixed lengths") {
    val words = Words("hello world this is a test")
    val processedWords = words.toProcessedWords.get

    assert(processedWords.rawWords == "hello world this is a test")
    assert(processedWords.mapOfWords == Map("hello" -> 5, "world" -> 5, "this" -> 4, "is" -> 2, "a" -> 1, "test" -> 4))
    assert(processedWords.sortedListOfWordWithOddCounts.sorted == List(("a", 1), ("hello", 5), ("world", 5)).sorted)
  }

  test("toProcessedWords should handle empty string") {
    val words = Words("")
    val processedWords = words.toProcessedWords
    assert(processedWords.isEmpty)
  }

  test("characterCount should return correct count for a word") {
    val words = Words("dummy")
    val count = words.characterCount("hello")

    assert(count == 5)
  }

  test("characterCount should handle empty word") {
    val words = Words("dummy")
    val count = words.characterCount("")

    assert(count == 0)
  }

}
