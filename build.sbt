
name := "odin_quick_start"
organization := "org.clulab"

scalaVersion := "2.12.4"

//EclipseKeys.withSource := true

libraryDependencies ++= {
  val procVer = "8.4.3"

  Seq(
    "org.clulab"    %% "processors-main"          % procVer,
    "org.clulab"    %% "processors-corenlp"       % procVer,
    "org.clulab"    %% "processors-openie"        % procVer,
    "ai.lum"        %% "common"                   % "0.0.8",
    "org.scalatest" %% "scalatest"                % "3.0.4" % "test",
    "com.typesafe"  %  "config"                   % "1.3.1",

    "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2"
  )
}


lazy val core = project in file(".")

lazy val webapp = project
  .enablePlugins(PlayScala)
  .aggregate(core)
  .dependsOn(core)
