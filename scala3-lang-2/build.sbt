val scala3Version = "3.2.2"

scalaVersion := scala3Version

val scalaTestDeps = Seq(
  "org.scalatest" %% "scalatest" % "3.2.16" % Test,
  "org.scalatest" %% "scalatest-shouldmatchers" % "3.2.16" % Test,
  "org.scalatest" %% "scalatest-wordspec" % "3.2.16" % Test,
  "org.scalatest" %% "scalatest-flatspec" % "3.2.16" % Test
)
/* extra runtime checks to find ill-formed trees or types as soon as they are created
 *  and check compiler invariants for tree well-formedness
 */
//scalacOptions += "-Xcheck-macros"
//scalacOptions += "-Ycheck:all"

libraryDependencies ++= scalaTestDeps
