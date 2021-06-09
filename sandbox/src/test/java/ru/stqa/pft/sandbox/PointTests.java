package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistance() {
    Point p1 = new Point(0, 0);
    Point p2 = new Point(0, 1);
    Assert.assertEquals(p1.distanceTo(p2), 1);
  }

  {
    Point p1 = new Point(0, 0);
    Point p2 = new Point(2, 0);
    Assert.assertEquals(p1.distanceTo(p2), 2);
  }

}
