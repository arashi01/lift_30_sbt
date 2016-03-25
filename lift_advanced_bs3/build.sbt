name := "Lift v3.0 Template Application with Bootstrap v3"

version := "0.9.0-SNAPSHOT"

organization := "net.liftweb"

scalaVersion := "2.11.6"

resolvers ++= Seq("snapshots"     at "https://oss.sonatype.org/content/repositories/snapshots",
                  "staging"       at "https://oss.sonatype.org/content/repositories/staging",
                  "releases"      at "https://oss.sonatype.org/content/repositories/releases"
                 )

enablePlugins(JettyPlugin)

unmanagedResourceDirectories in Test <+= (baseDirectory) { _ / "src/main/webapp" }

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")

libraryDependencies ++= {
  val liftVersion = "3.0-RC1"
  Seq(
    "net.liftweb"       %% "lift-webkit"        % liftVersion        % "compile",
    "net.liftweb"       %% "lift-mapper"        % liftVersion        % "compile",
    "net.liftmodules"   %% "fobo_3.0"           % "1.5"     % "compile",
    "javax.servlet"     % "javax.servlet-api"   % "3.0.1"             % "provided",
    "org.eclipse.jetty" % "jetty-webapp"        % "8.1.17.v20150415"  % "test",
    "org.eclipse.jetty" % "jetty-plus"          % "8.1.17.v20150415"  % "test", // For Jetty Config
    "ch.qos.logback"    % "logback-classic"     % "1.1.3",
    "org.specs2"        %% "specs2"             % "2.3.12"           % "test",
    "org.specs2"        %% "specs2-core"        % "3.6.4"            % "test",
    "com.h2database"    % "h2"                  % "1.4.187"
  )
}
