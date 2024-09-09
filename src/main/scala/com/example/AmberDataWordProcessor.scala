package com.example

import com.typesafe.scalalogging.LazyLogging
import upickle.default.*


object AmberDataWordProcessor extends App with LazyLogging with WordSerializer {
  logger.info("AmberDataWordProcessor")

  override def serializeWords(rawJson: String): Seq[Words] = {
    read[Seq[Words]](rawJson)
  }

  val words: Seq[Words] = serializeWords(os.read(os.pwd / "resources" / "words.json"))

  val processedWords: Seq[ProcessedWords] = words.flatMap(_.toProcessedWords)
}

