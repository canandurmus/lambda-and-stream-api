package com.lets.learn.lambdas.util;

public class TimeIt {
  public static void calculate(Runnable code) {
    long start = System.nanoTime();
    try {
      code.run();
    } finally {
      long end = System.nanoTime();
      System.out.println("Time taken(s): " + (end - start)/1.0e9);
    }
  }
}
