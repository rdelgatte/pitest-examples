package com.github.rdelgatte.pitest;

import com.decathlon.cube.tesseract.test.extensions.mockito.MockitoExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
class ValidatorTest {

  private Validator cut;

  @BeforeEach
  void setUp() {
    cut = new Validator();
  }

  @Test
  void inputUnderHundred_isValid() {
    cut.isValid(50);
  }

  @Test
  void inputOverHundred_isValid() {
    cut.isValid(110);
  }
}
