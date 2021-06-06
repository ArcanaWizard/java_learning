package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    Point p1 = new Point(2, 2);
    Point p2 = new Point(3, 1);
    System.out.println("Расстояние между точками = " + distance(p1, p2));

  }

  public static double distance(Point p1, Point p2) {
    return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
  }
}