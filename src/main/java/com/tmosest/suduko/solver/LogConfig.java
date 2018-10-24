package com.tmosest.suduko.solver;

/**
 * Config object for logging.
 */
public class LogConfig {
  private static boolean debugMode = false;

  public static boolean isDebugMode() {
    return debugMode;
  }

  public static void setDebugMode(boolean debugMode) {
    LogConfig.debugMode = debugMode;
  }
}
