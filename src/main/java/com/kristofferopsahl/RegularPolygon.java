package com.kristofferopsahl;

public record RegularPolygon(Integer n, Double s) {
  Double getArea() {
    if (n > 2) {
      return (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
    } else {
      return null; // Don't do this in real code.
    }
  }
}
