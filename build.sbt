name := "GeekBang Algorithm Bootcamp"

lazy val scalaMajorVersion = "2.13"
lazy val scalaMinorVersion = "3"

lazy val scalaTestVersion = "3.2.0"
lazy val scalaTest = "org.scalatest" %% "scalatest" % scalaTestVersion

ThisBuild / scalaVersion := s"$scalaMajorVersion.$scalaMinorVersion"

ThisBuild / scalacOptions += "-deprecation"

ThisBuild / libraryDependencies += scalaTest

lazy val week01 = (project in file("Week_01"))
  .settings(
    unmanagedSourceDirectories in Compile += baseDirectory.value,
    unmanagedSourceDirectories in Test += baseDirectory.value / "test"
  )
