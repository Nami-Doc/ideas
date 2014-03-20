name := "ideas"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)

resolvers += "FuseSource Public Repository" at "http://repo.fusesource.com/nexus/content/repositories/public"

libraryDependencies ++= Seq(
  "org.fusesource.scalate" %% "scalate-core" % "1.6.1",
  "org.fusesource.scalate" %% "scalate-wikitext" % "1.6.1",
  "org.fusesource.scalate" %% "scalate-page" % "1.6.1"
)

play.Project.playScalaSettings

patience.assets.StylusPlugin.stylusSettings