ThisBuild / version      := "0.0.1.SNAPSHOT"
ThisBuild / scalaVersion := "2.12.8"
ThisBuild / organization := "com.satish"

val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"
val gigahorse = "com.eed3si9n" %% "gigahorse-okhttp" % "0.3.1"
val playJson  = "com.typesafe.play" %% "play-json" % "2.6.9"

lazy val sbtcommons = (project in file("."))
  .settings(
    name := "sbt-commons",
    libraryDependencies ++= Seq(gigahorse, playJson),
    libraryDependencies += scalaTest % Test,
  )