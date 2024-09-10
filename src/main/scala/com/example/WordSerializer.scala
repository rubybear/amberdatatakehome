package com.example

trait WordSerializer {
  def serializeWords(rawString: String): Seq[Words]
}
