package com.kristofferopsahl;

import java.util.Objects;

public class Utils {
  static Double convertSquareCmToSquareMeter(Double cm) {
    if (Objects.isNull(cm)) {
      return null;
    } else {
      return cm / 10000.0;
    }
  }
}
