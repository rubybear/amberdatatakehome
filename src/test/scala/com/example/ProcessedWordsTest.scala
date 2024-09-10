package com.example

import org.scalatest.funsuite.AnyFunSuiteLike

class ProcessedWordsTest extends AnyFunSuiteLike {

  test("create should return Some(ProcessedWords) for valid input") {
    val rawWords = "hello world"
    val mapOfWords = Map("hello" -> 1, "world" -> 2)
    val sortedListOfWordWithOddCounts = List(("hello", 1))

    val result = ProcessedWords.create(rawWords, mapOfWords, sortedListOfWordWithOddCounts)

    assert(result.isDefined)
    assert(result.get.rawWords == rawWords)
    assert(result.get.mapOfWords == mapOfWords)
    assert(result.get.sortedListOfWordWithOddCounts == sortedListOfWordWithOddCounts)
  }

  test("create should return None for input with empty keys after trimming") {
    val rawWords = "hello world"
    val mapOfWords = Map("hello" -> 1, " " -> 2)
    val sortedListOfWordWithOddCounts = List(("hello", 1))

    val result = ProcessedWords.create(rawWords, mapOfWords, sortedListOfWordWithOddCounts)

    assert(result.isEmpty)
  }

  test("create should trim keys in mapOfWords") {
    val rawWords = "hello world"
    val mapOfWords = Map(" hello " -> 1, " world " -> 2)
    val sortedListOfWordWithOddCounts = List(("hello", 1))

    val result = ProcessedWords.create(rawWords, mapOfWords, sortedListOfWordWithOddCounts)

    assert(result.isDefined)
    assert(result.get.mapOfWords == Map("hello" -> 1, "world" -> 2))
  }

}
