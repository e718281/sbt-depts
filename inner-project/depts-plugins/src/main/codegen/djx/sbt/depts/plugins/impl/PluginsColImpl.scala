package djx.sbt.depts.plugins.impl

import sbt.librarymanagement.syntax._

trait PluginsColImpl {

  val `sbt-scalafmt`: sbt.librarymanagement.ModuleID = """org.scalameta""" % """sbt-scalafmt""" % """2.6.2"""

  val `sbt-twirl`: sbt.librarymanagement.ModuleID = """org.playframework.twirl""" % """sbt-twirl""" % """2.1.0-M9"""

  val `sbt-pgp`: sbt.librarymanagement.ModuleID = """com.github.sbt""" % """sbt-pgp""" % """2.4.0"""

  val `sbt-scalajs-crossproject`: sbt.librarymanagement.ModuleID = """org.portable-scala""" % """sbt-scalajs-crossproject""" % """1.4.0"""

  val `sbt-scala-native-crossproject`: sbt.librarymanagement.ModuleID =
    """org.portable-scala""" % """sbt-scala-native-crossproject""" % """1.4.0"""

  val `sbt-git`: sbt.librarymanagement.ModuleID = """com.github.sbt""" % """sbt-git""" % """3.0.0"""

  val `sbt-ide-settings`: sbt.librarymanagement.ModuleID = """org.jetbrains.scala""" % """sbt-ide-settings""" % """1.1.4"""

  val `sbt-scalajs`: sbt.librarymanagement.ModuleID = """org.scala-js""" % """sbt-scalajs""" % """1.23.0"""

  val `sbt-crossproject`: sbt.librarymanagement.ModuleID = """org.portable-scala""" % """sbt-crossproject""" % """1.4.0"""

  val `flyway-sbt`: sbt.librarymanagement.ModuleID = """com.github.sbt""" % """flyway-sbt""" % """13.0.0"""

  val `sbt-js-engine`: sbt.librarymanagement.ModuleID = """com.github.sbt""" % """sbt-js-engine""" % """1.4.0-M4"""

  val `sbt-assembly`: sbt.librarymanagement.ModuleID = """com.eed3si9n""" % """sbt-assembly""" % """2.5.0"""

  val `sbt-scoverage`: sbt.librarymanagement.ModuleID = """org.scoverage""" % """sbt-scoverage""" % """2.4.4"""

  val `sbt-github-actions`: sbt.librarymanagement.ModuleID = """com.github.sbt""" % """sbt-github-actions""" % """0.32.2"""

  val `sbt-jacoco`: sbt.librarymanagement.ModuleID = """com.github.sbt""" % """sbt-jacoco""" % """3.8.0"""

  val `sbt-jmh`: sbt.librarymanagement.ModuleID = """com.github.sbt""" % """sbt-jmh""" % """0.4.9"""

  val `sbt-native-packager`: sbt.librarymanagement.ModuleID = """com.github.sbt""" % """sbt-native-packager""" % """1.13.0"""

  val `sbt-less`: sbt.librarymanagement.ModuleID = """com.github.sbt""" % """sbt-less""" % """2.1.0-M2"""

  val `sbt-web`: sbt.librarymanagement.ModuleID = """com.github.sbt""" % """sbt-web""" % """1.6.0-M4"""

  val `sbt-web-scalajs`: sbt.librarymanagement.ModuleID = """com.vmunier""" % """sbt-web-scalajs""" % """1.4.0"""

  val `sbt-playframework`: sbt.librarymanagement.ModuleID = """org.playframework""" % """sbt-plugin""" % """3.1.0-M9"""

  val `sbt-java-formatter`: sbt.librarymanagement.ModuleID = """com.github.sbt""" % """sbt-java-formatter""" % """0.14.0"""

  val `sbt-uni-crossproject`: sbt.librarymanagement.ModuleID = """org.wvlet.uni""" % """sbt-uni-crossproject""" % """2026.1.41"""

}
