package ru.stqa.pft.sandbox;

public class Point {
  private final double x;
  private final double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distanceTo(Point other) {
    double dx = other.x - this.x;
    double dy = other.y - this.y;
    double distance = Math.sqrt(dx * dx + dy * dy);
    return distance;
  }
}
