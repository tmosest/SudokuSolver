package com.tmosest.suduko.solver;

public class Sudoku {
  public static int BOARD_SIZE = 9;
  public static int EMPTY_CELL = 0;
  public static int MIN_CELL = 1;
  public static int MAX_CELL = 9;

  public int[][] board;

  public Sudoku() {
    board = new int[BOARD_SIZE][BOARD_SIZE];
  }

  public int get(int row, int column) {
    return board[row][column];
  }

  public void set(int row, int column, int value) throws InvalidInputException, OutOfBoundsException {
    if (row >= BOARD_SIZE || column >= BOARD_SIZE || row < 0 || column < 0) {
      throw new OutOfBoundsException();
    }
    if (value < MIN_CELL || value > MAX_CELL) {
      throw new InvalidInputException();
    }
    board[row][column] = value;
  }
}
