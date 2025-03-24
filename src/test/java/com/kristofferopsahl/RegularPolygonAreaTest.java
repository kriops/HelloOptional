package com.kristofferopsahl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class RegularPolygonAreaTest {
  @Test
  void lineArea() {
    var sidelength = 7.0;
    var numSides = 2;
    RegularPolygon polygon = new RegularPolygon(numSides, sidelength);
    assertNull(polygon.getArea()); // Don't do this in real code.
  }

  @Test
  void triangleArea() {
    var sidelength = 7.0;
    var numSides = 3;
    RegularPolygon polygon = new RegularPolygon(numSides, sidelength);
    assertEquals((Math.pow(sidelength, 2) * Math.sqrt(3)) / 4.0, polygon.getArea(), 1e-10);
  }

  @Test
  void squareArea() {
    var sidelength = 7.0;
    var numSides = 4;
    RegularPolygon polygon = new RegularPolygon(numSides, sidelength);
    assertEquals(Math.pow(sidelength, 2), polygon.getArea(), 1e-10);
  }

  @Test
  void hexagonArea() {
    var sidelength = 7.0;
    var numSides = 6;
    RegularPolygon polygon = new RegularPolygon(numSides, sidelength);
    assertEquals((3 * Math.pow(sidelength, 2) * Math.sqrt(3)) / 2.0, polygon.getArea(), 1e-10);
  }
}
