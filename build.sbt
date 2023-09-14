import Dependencies._

// ThisBuild / scalaVersion     := "2.13.11"
ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "OpenCage Scala Client Example",
    libraryDependencies += munit % Test
  )
resolvers +=
  "opencagedata" at "https://mvnrepository.com/artifact"

libraryDependencies ++= Seq(
    "com.github.scopt" %% "scopt" % "4.1.0",
    "com.opencagedata" %% "scala-opencage-geocoder" % "1.1.1"
)

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
