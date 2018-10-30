package com.tmosest.suduko.solver;

public class SudokuSolver {
  private Sudoku sudoku;

  public SudokuSolver(Sudoku sudoku) {
    this.sudoku = sudoku;
  }

  public boolean hasEmptyCell() {
    for (int row = 0; row < Sudoku.BOARD_SIZE; row++) {
      for (int col = 0; col < Sudoku.BOARD_SIZE; col++) {
        if (sudoku.get(row, col) == Sudoku.EMPTY_CELL) {
          return true;
        }
      }
    }
    return false;
  }
}
