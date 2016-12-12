package com.fererlab.scala

import java.util.logging.Level


object LoggerS {

  def log(level: Level, log: String): Unit = {
    printf("%s %s%n", level, log)
  }

}
