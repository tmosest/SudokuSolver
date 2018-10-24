package com.tmosest.suduko.solver;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Sudoku: Logger")
public class LoggerTest {
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;
  private final PrintStream originalErr = System.err;

  @BeforeEach
  public void setUpStreams() {
    LogConfig.setDebugMode(false);
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));
  }

  @AfterEach
  public void restoreStreams() {
    System.setOut(originalOut);
    System.setErr(originalErr);
  }

  @Test
  public void shouldNotLogByDefault() {
    Logger.logDebug("test");
    Assertions.assertNotEquals("test", outContent.toString());
  }

  @Test
  public void shouldLogIfDebugModeIsTrue() {
    LogConfig.setDebugMode(true);
    Assertions.assertTrue(LogConfig.isDebugMode());
    Logger.logDebug("test");
    Assertions.assertEquals("test".trim(), outContent.toString().trim());
  }
}
