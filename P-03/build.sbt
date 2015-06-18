lazy val root = (project in file(".")).
  settings(
    name := "P-03",
    version := "1.0",
    scalaVersion := "2.11.4"
  )
libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.12.4" % "test"
)
