package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    Point p = new Point(2, 2, 3, 1);
    System.out.println("Расстояние между точками = " + p.distance());
  }
}