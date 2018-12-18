
scalaVersion := "2.12.6"

resolvers += "stepsoft" at "http://nexus.mcsherrylabs.com/repository/releases"

resolvers += "stepsoft-snapshots" at "http://nexus.mcsherrylabs.com/repository/snapshots"

resolvers += "vaadin-addons" at "http://maven.vaadin.com/vaadin-addons"

resolvers += "indvd00m-github-repo" at "https://github.com/indvd00m/maven-repo/raw/master/repository"

resolvers += "Sonatype Nexus Releases" at "https://oss.sonatype.org/content/repositories/releases"

//Seq(vaadinWebSettings: _*)

val vaadinVer = Vers.vaadinVer

coverageEnabled := false

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % Vers.akkaVer,
  "com.typesafe.akka" %% "akka-remote" % Vers.akkaVer,
  "com.vaadin" % "vaadin-server" % vaadinVer,
  "com.vaadin" % "vaadin-themes" % vaadinVer,
  "com.vaadin" % "vaadin-push" % vaadinVer,
  "com.vaadin" % "vaadin-client-compiler" % vaadinVer,
  "com.vaadin" % "vaadin-client-compiled" % vaadinVer,
  "us.monoid.web" % "resty" % Vers.restyVer,
  //"org.vaadin.icons" % "vaadin-icons" % "1.0.1",
  "org.scalatra" %% "scalatra" % Vers.scalatraVer,
  "io.spray" %%  "spray-json" % Vers.sprayJsonVer,
  "com.typesafe.akka" %% "akka-slf4j" % Vers.akkaVer,
  "ch.qos.logback" % "logback-classic" % "1.0.0" % "runtime",
  "com.mcsherrylabs" %% "sss-ancillary" % Vers.ancillaryVer

)

