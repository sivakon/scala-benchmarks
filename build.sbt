import sbt.Keys._

val dottyVersion = "0.7.0-RC1"

val scVersion = "2.12.4"

lazy val root = (project in file(".")).
  enablePlugins(JmhPlugin).
  settings(
    name := "benchmarking0",
    version := "1.0",
    scalaVersion := scVersion
  )