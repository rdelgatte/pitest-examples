package com.github.rdelgatte.pitest;

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
  @DisplayName("Should return true given 100")
  void hundred_isValid_returnsTrue() {
    assertThat(cut.isValid(100)).isTrue();
  }

  @Test
  @DisplayName("Should return false given 0")
  void zero_isValid_returnsFalse() {
    assertThat(cut.isValid(0)).isFalse();
  }
}
