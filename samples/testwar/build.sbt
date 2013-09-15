import play.Project._
import com.earldouglas.xsbtwebplugin.WarPlugin

name := "testwar"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "com.typesafe.play" %% "play" % "2.2-SNAPSHOT" exclude ("javax.servlet", "servlet-api"),
  "javax.servlet" % "servlet-api" % "2.5"
  )     

playScalaSettings

WarPlugin.warSettings
