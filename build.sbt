seq(webSettings :_*)

name := "SpringMovies"

// Don't need Scala stuff here.
autoScalaLibrary := false

// Removes the scala-2.x.x prefix on targets
crossPaths := false

// Needed if Tomcat is build with Java 1.6
javacOptions ++= Seq("-target", "1.6", "-source", "1.6")

version := "0.1"

{
    val springVersion = "3.1.0.RELEASE"   
    libraryDependencies ++= Seq(
    "org.springframework" % "spring-core" % springVersion,
    "org.springframework" % "spring-web" %  springVersion,
    "org.springframework" % "spring-webmvc" % springVersion,
    "org.codehaus.jackson" % "jackson-mapper-asl" % "1.9.9",
    "org.mortbay.jetty" % "jetty" % "6.1.22" % "container"     // Needed for xsbt-web
    )
}


