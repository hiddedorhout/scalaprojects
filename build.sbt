name := "baker-test"

version := "0.1"

scalaVersion := "2.12.0"

libraryDependencies += "com.ing.baker" %% "baker-recipe-dsl" % "2.0.3"
libraryDependencies += "com.ing.baker" %% "baker-runtime" % "2.0.3"
libraryDependencies += "com.ing.baker" %% "baker-compiler" % "2.0.3"

// https://mvnrepository.com/artifact/guru.nidi/graphviz-java
libraryDependencies += "guru.nidi" % "graphviz-java" % "0.8.8"
libraryDependencies += "org.scalatest" % "scalatest_2.13" % "3.0.8" % "test"
