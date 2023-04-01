version := "0.1"
scalaVersion := "2.13.10"
name := "spark-template"


libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.3.2",
  "org.apache.spark" %% "spark-sql" % "3.3.2",
  "org.scalatest" %% "scalatest" % "3.2.15" % Test,
  "org.scalatest" %% "scalatest-funsuite" % "3.2.15" % Test
)

enablePlugins(AssemblyPlugin)

// Define the settings for the assembly plugin
assembly / assemblyMergeStrategy := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}
