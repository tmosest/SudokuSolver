package com.tmosest.suduko.solver;

/**
 * Logger utility class.
 */
public class Logger {

  /**
   * logs a message to system out if debug mode is on.
   * @param toLog String to output.
   */
  public static void logDebug(String toLog) {
    if (LogConfig.isDebugMode()) {
      System.out.println(toLog);
    }
  }
}
