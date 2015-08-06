name := """play-dashboards"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

resolvers ++= Seq(
  "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases",
  "google-sedis-fix" at "http://pk11-scratch.googlecode.com/svn/trunk"
)

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.specs2" %% "specs2-core" % "3.6.3" % Test,
  "org.scalaz" %% "scalaz-core" % "7.1.1",
  "com.typesafe.akka" %% "akka-actor" % "2.2.3",
  "com.typesafe.akka" %% "akka-contrib" % "2.2.3",
  "com.amazonaws" % "aws-java-sdk" % "1.8.0",
  "net.debasishg" %% "redisclient" % "3.0",
  "org.twitter4j" % "twitter4j-stream" % "4.0.3"
)

scalacOptions in Test ++= Seq("-Yrangepos")

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
