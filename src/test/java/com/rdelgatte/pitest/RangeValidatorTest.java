package com.rdelgatte.pitest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RangeValidatorTest {

  private RangeValidator cut;

  @BeforeEach
  void setUp() {
    cut = new RangeValidator();
  }

  /**
   * {@link RangeValidator#isValid(int)}
   */

  @Test
  @DisplayName("Should return true given 50")
  void fifty_isValid_returnsTrue() {
    cut.isValid(50);
  }

  @Test
  @DisplayName("Should return false given 200")
  void twoHundred_isValid_returnsFalse() {
    cut.isValid(200);
  }

  @Test
  @DisplayName("Should return false given -10")
  void minusTen_isValid_returnsFalse() {
    cut.isValid(-10);
  }
}
