name := "ideas"

version := "1.0-SNAPSHOT"

scalacOptions ++= Seq(
  "-deprecation",           
  "-encoding", "UTF-8",       // yes, this is 2 args
  "-feature",                
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-unchecked",
  "-Xfatal-warnings",       
  "-Xlint",
  "-Yno-adapted-args",       
  "-Ywarn-dead-code",        // N.B. doesn't work well with the ??? hole
  "-Ywarn-numeric-widen",   
  "-Ywarn-value-discard",
  "-language:postfixOps"
)

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "mysql" % "mysql-connector-java" % "5.1.21"
)

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-compiler" % "2.10.3"
)

play.Project.playScalaSettings

patience.assets.StylusPlugin.stylusSettings

resolvers += Resolver.sonatypeRepo("releases")

// Can't use Wart Remover with play source reloader ...
//addCompilerPlugin("org.brianmckenna" %% "wartremover" % "0.8")
//scalacOptions in (Compile, compile) += "-P:wartremover:traverser:org.brianmckenna.wartremover.warts.Unsafe"