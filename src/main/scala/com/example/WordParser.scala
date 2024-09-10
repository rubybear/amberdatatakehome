package com.example

trait WordParser {
  def parseWords(rawString: String): Seq[Words]
}
