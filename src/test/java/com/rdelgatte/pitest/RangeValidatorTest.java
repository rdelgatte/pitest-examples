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
    assertThat(cut.isValid(50)).isTrue();
  }

  @Test
  @DisplayName("Should return true given 200")
  void twoHundred_isValid_returnsTrue() {
    assertThat(cut.isValid(200)).isTrue();
  }

  @Test
  @DisplayName("Should return true given -10")
  void minus10_isValid_returnsTrue() {
    assertThat(cut.isValid(-10)).isTrue();
  }

  @Test
  @DisplayName("Should return true given 0")
  void zero_isValid_returnsTrue() {
    assertThat(cut.isValid(0)).isFalse();
  }

}
