package com.tmosest.suduko.solver;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Sudoku: LogConfig")
public class LogConfigTest {
  @Test
  public void canToggleDebugMode() {
    Assertions.assertFalse(LogConfig.isDebugMode());
    LogConfig.setDebugMode(true);
    Assertions.assertTrue(LogConfig.isDebugMode());
  }
}
