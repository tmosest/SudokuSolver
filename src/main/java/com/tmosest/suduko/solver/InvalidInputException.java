package com.tmosest.suduko.solver;

public class InvalidInputException extends Exception {
 public InvalidInputException() {
   super("Input must be between 1 and 9");
 }
}
