package com.tmosest.suduko.solver;

public class OutOfBoundsException extends Exception {
 public OutOfBoundsException() {
   super("rows and cols should be between 0 and 8");
 }
}
