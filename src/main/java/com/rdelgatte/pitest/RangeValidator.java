package com.rdelgatte.pitest;

class RangeValidator {

  boolean isValid(int input) {

    if (input > 0 && input <= 100) {
      return true;
    }

    if (input < 0 ) {
      return true;
    }

    if (input > 100) {
      return true;
    }

    return false;

  }
}
