package com.kristofferopsahl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Objects;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class RegularPolygonTest {
  static final Integer numSides = 2;
  static final Double sideLength = 2.0;

  @Test
  void imperativeDemo() {
    final RegularPolygon shape = new RegularPolygon(numSides, sideLength);
    final Double areaInCm = shape.getArea();
    final Double areaInM = Utils.convertSquareCmToSquareMeter(areaInCm);
    final String areainSquareMeterAsString =
        Objects.isNull(areaInM) ? "Undefined" : areaInM.toString();
    assertNull(areaInM);
    assertEquals("Undefined", areainSquareMeterAsString);
  }

  @Test
  void optionalDemo() {
    final var maybeAreainSquareMeterAsString =
        Optional.of(new RegularPolygon(numSides, sideLength))
            .map(RegularPolygon::getArea)
            .map(Utils::convertSquareCmToSquareMeter)
            .map(areaInM -> Objects.isNull(areaInM) ? "Undefined" : areaInM.toString());
    assertFalse(maybeAreainSquareMeterAsString.isPresent());
  }
}
