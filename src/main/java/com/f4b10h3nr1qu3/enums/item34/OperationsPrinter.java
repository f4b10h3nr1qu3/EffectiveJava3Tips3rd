package com.f4b10h3nr1qu3.enums.item34;

public class OperationsPrinter {

  public static void main(String[] args) {

    double x = 18d;

    double y = 8d;

    for (Operation op : Operation.values()) {
      System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
    }

  }
}
