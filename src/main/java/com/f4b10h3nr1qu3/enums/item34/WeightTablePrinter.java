package com.f4b10h3nr1qu3.enums.item34;

public class WeightTablePrinter {

  public static void main(String[] args) {

    double earthWeight = 200d;

    double mass = earthWeight / Planet.EARTH.surfaceGravity();

    for (Planet p : Planet.values()) { //returns an array of its values in the order they were declared
      System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
    }

  }
}
