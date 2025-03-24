package com.kristofferopsahl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Objects;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class RegularPolygonTest {
  static final Integer numSides = 2;
  static final Double sideLength = 2.0;
  static final RegularPolygon shape = new RegularPolygon(numSides, sideLength);
  

  @Test
  void convertAndDescribe() {
    final var areaInCm = shape.getArea();
    final var areaInM = Utils.convertSquareCmToSquareMeter(areaInCm);
    final var areainSquareMeterAsString =
        Objects.isNull(areaInM) ? "Undefined" : areaInM.toString();
    assertNull(areaInM);
  }

  @Test
  void convertAndDescribeWithOptional() {
    final var maybeAreainSquareMeterAsString =
        Optional.of(shape)
            .map(RegularPolygon::getArea)
            .map(Utils::convertSquareCmToSquareMeter)
            .map(areaInM -> Objects.isNull(areaInM) ? "Undefined" : areaInM.toString());
    assertFalse(maybeAreainSquareMeterAsString.isPresent());
  }
}
