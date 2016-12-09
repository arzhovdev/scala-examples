
name := "scala-examples"

version := "1.0"

scalaVersion := "2.12.1"

// grading libraries
libraryDependencies += "junit" % "junit" % "4.11" % "test"
libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"

/*PiTest*/
//libraryDependencies += "org.pitest" % "pitest" % "1.1.10"

//import org.pitest.sbt.PitKeys._

//verbose := true
//timestampedReports := false
//coverageThreshold := 100
//mutationThreshold := 75