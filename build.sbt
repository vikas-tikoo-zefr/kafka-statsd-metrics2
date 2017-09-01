name := "kafka-statsd"
scalaVersion := "2.11.8"
organization := "com.zefr.dp"
version := "1.0"

scalaVersion := "2.11.8"

val kafkaVersion = "0.11.0.0"
val confluentVersion = ""

resolvers += Resolver.sonatypeRepo("releases")
resolvers += Resolver.sonatypeRepo("snapshots")


//val mavenLocal = "Local Maven" at Path.userHome.asFile.toURI.toURL + ".m2/repository"
//resolvers += Resolver.mavenLocal

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.12",
  "org.slf4j" % "slf4j-api" % "1.7.5",
  "org.slf4j" % "slf4j-log4j12" % "1.7.21",
  "com.datadoghq" % "java-dogstatsd-client" % "2.3",
  "org.apache.kafka" % "kafka-clients" % kafkaVersion,
  "org.apache.kafka" % "kafka-streams" % "0.11.0.0",
  "org.apache.kafka" %% "kafka" % kafkaVersion exclude ("org.slf4j","slf4j-log4j12") exclude("log4j", "log4j"),
  //"org.coursera" % "dropwizard-metrics-datadog" % "1.1.13",
  "org.easymock" % "easymock" % "3.2",
  "org.mockito" % "mockito-core"  % "2.8.9"
)
