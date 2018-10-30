package com.tmosest.suduko.solver;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Sudoku: Sudoku Solver")
public class SudokuSolverTest {

  Sudoku sudoku;
  SudokuSolver sudokuSolver;

  @BeforeEach
  public void setUpStreams() {
    sudoku = new Sudoku();
    sudokuSolver = new SudokuSolver(sudoku);
  }

  @Test
  void shouldBeAbleToDetermineIfBoardHasAnEmptyCell() {
    Assertions.assertTrue(sudokuSolver.hasEmptyCell());
  }
}
