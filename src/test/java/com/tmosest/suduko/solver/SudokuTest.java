package com.tmosest.suduko.solver;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Sudoku: Sudoku")
public class SudokuTest {
  int col, row, val;
  Sudoku sudoku;

  @BeforeEach
  public void setUpStreams() {
    col = 0;
    row = 0;
    val = 1;
    sudoku = new Sudoku();
  }

  @Test
  public void shouldBeAbleCreateEmptyBoard() {
    for (int row = 0; row < Sudoku.BOARD_SIZE; row++) {
      for (int col = 0; col < Sudoku.BOARD_SIZE; col++) {
        Assertions.assertEquals(Sudoku.EMPTY_CELL, sudoku.get(row, col));
      }
    }
  }

  @Test
  void shouldBeAbleToSetACell() throws InvalidInputException, OutOfBoundsException {
    sudoku.set(row, col, val);
    Assertions.assertEquals(val, sudoku.get(row, col));
  }

  @Test
  void shouldThrowInvalidInputExceptionIfInputIsTooLarge() {
    val = Sudoku.MAX_CELL + 1;
    Assertions.assertThrows(InvalidInputException.class, () -> sudoku.set(row, col, val));
  }

  @Test
  void shouldThrowInvalidInputExceptionIfInputIsTooSmall() {
    val = Sudoku.MIN_CELL - 1;
    Assertions.assertThrows(InvalidInputException.class, () -> sudoku.set(row, col, val));
  }

  @Test
  void shouldThrowOutOfBoundExceptionIfRowIsTooSmall() {
    row = -1;
    Assertions.assertThrows(OutOfBoundsException.class, () -> sudoku.set(row, col, val));
  }

  @Test
  void shouldThrowOutOfBoundExceptionIfRowIsTooBig() {
    row = Sudoku.BOARD_SIZE + 1;
    Assertions.assertThrows(OutOfBoundsException.class, () -> sudoku.set(row, col, val));
  }

  @Test
  void shouldThrowOutOfBoundExceptionIfColumnIsTooSmall() {
    col = -1;
    Assertions.assertThrows(OutOfBoundsException.class, () -> sudoku.set(row, col, val));
  }

  @Test
  void shouldThrowOutOfBoundExceptionIfColumnIsTooBig() {
    col = Sudoku.BOARD_SIZE + 1;
    Assertions.assertThrows(OutOfBoundsException.class, () -> sudoku.set(row, col, val));
  }
}
