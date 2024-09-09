lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "3.4.3",
      libraryDependencies += "org.scala-lang" %% "toolkit" % "0.4.0"
    )),
    name := "amberdata"
  )

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.5.6"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % Test
