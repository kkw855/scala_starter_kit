name := "scala_starter_kit"

version := "0.1"

scalaVersion := "2.13.3"

val circeVersion = "0.13.0"

// Config
libraryDependencies += "com.typesafe" % "config" % "1.4.0" withSources () withJavadoc ()

// Log
libraryDependencies += "org.slf4j" % "slf4j-api" % "2.0.0-alpha1" withSources () withJavadoc ()
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.3.0-alpha5" withSources () withJavadoc ()

// Cats
libraryDependencies += "org.typelevel" %% "cats-core" % "2.0.0" withSources () withJavadoc ()

// Cats Effect
libraryDependencies += "org.typelevel" %% "cats-effect" % "2.1.3" withSources () withJavadoc ()

// Netty for MQTT
libraryDependencies += "io.netty" % "netty-all" % "5.0.0.Alpha2" withSources () withJavadoc ()

// Reflection
libraryDependencies += "org.scala-lang" % "scala-reflect" % "2.13.2" withSources () withJavadoc ()

// Kafka for Producer, Consumer
libraryDependencies += "org.apache.kafka" % "kafka-clients" % "2.5.0" withSources () withJavadoc ()

// Circe for JSON
libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  // for parsing JSON
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)

// Test
libraryDependencies += "org.scalactic" %% "scalactic" % "3.3.0-SNAP2"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.3.0-SNAP2" % Test