name := "ammonite-scripts"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "com.lihaoyi" % "ammonite" % "1.0.3" cross CrossVersion.full,
  "com.lihaoyi" % "ammonite-sshd" % "1.0.3" cross CrossVersion.full,
  "com.lihaoyi" % "ammonite-shell" % "1.0.3" cross CrossVersion.full,
  "com.lihaoyi" % "ammonite-compiler" % "1.0.3" cross CrossVersion.full,
  "com.lihaoyi" %% "scalatags" % "0.6.7"
)
