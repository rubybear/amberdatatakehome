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

  test("toProcessedWords should handle single word with odd length") {
    val words = Words("oddword")
    val processedWords = words.toProcessedWords.get

    assert(processedWords.rawWords == "oddword")
    assert(processedWords.mapOfWords == Map("oddword" -> 7))
    assert(processedWords.sortedListOfWordWithOddCounts == List(("oddword", 7)))
  }

  test("toProcessedWords should handle single word with even length") {
    val words = Words("evenword")
    val processedWords = words.toProcessedWords.get

    assert(processedWords.rawWords == "evenword")
    assert(processedWords.mapOfWords == Map("evenword" -> 8))
    assert(processedWords.sortedListOfWordWithOddCounts.isEmpty)
  }

  test("toProcessedWords should handle string with multiple spaces") {
    val words = Words("hello   world")
    val processedWords = words.toProcessedWords.get

    assert(processedWords.rawWords == "hello   world")
    assert(processedWords.mapOfWords == Map("hello" -> 5, "world" -> 5))
    assert(processedWords.sortedListOfWordWithOddCounts == List(("hello", 5), ("world", 5)))
  }

  test("toProcessedWords should handle string with special characters") {
    val words = Words("hello@world!")
    val processedWords = words.toProcessedWords.get

    assert(processedWords.rawWords == "hello@world!")
    assert(processedWords.mapOfWords == Map("hello@world!" -> 12))
  }

  test("toProcessedWords should handle string with mixed case") {
    val words = Words("Hello World")
    val processedWords = words.toProcessedWords.get

    assert(processedWords.rawWords == "Hello World")
    assert(processedWords.mapOfWords == Map("Hello" -> 5, "World" -> 5))
    assert(processedWords.sortedListOfWordWithOddCounts == List(("Hello", 5), ("World", 5)))
  }

  test("toProcessedWords should handle string with numeric characters") {
    val words = Words("hello123 world456")
    val processedWords = words.toProcessedWords.get

    assert(processedWords.rawWords == "hello123 world456")
    assert(processedWords.mapOfWords == Map("hello123" -> 8, "world456" -> 8))
    assert(processedWords.sortedListOfWordWithOddCounts.isEmpty)
  }

  test("toProcessedWords should handle string with punctuation") {
    val words = Words("hello, world!")
    val processedWords = words.toProcessedWords.get

    assert(processedWords.rawWords == "hello, world!")
    assert(processedWords.mapOfWords == Map("hello," -> 6, "world!" -> 6))
    assert(processedWords.sortedListOfWordWithOddCounts.isEmpty)
  }

}
