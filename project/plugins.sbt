// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository 
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.2")

resolvers += "Patience Releases" at "http://repo.patience.io/"

// Stylus plugin
addSbtPlugin("patience" % "play-stylus" % "1.0.0")

//resolvers += Resolver.url("Objectify Play Repository", url("https://github.com/SunPj/ivy/raw/master"))(Resolver.ivyStylePatterns)

// LiveScript plugin
//addSbtPlugin("com.github.alvinfrancis" % "play-livescript" % "0.1")

// IDEA IntelliJ generator
addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")
