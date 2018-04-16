package com.github.rdelgatte.pitest;

import static com.github.rdelgatte.pitest.FizzBuzz.BUZZ;
import static com.github.rdelgatte.pitest.FizzBuzz.FIZZ;
import static org.assertj.core.api.Assertions.assertThat;

import com.decathlon.cube.tesseract.test.extensions.mockito.MockitoExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
class FizzBuzzTest {

  private FizzBuzz cut;

  @BeforeEach
  void setUp() {
    cut = new FizzBuzz();
  }

  @Test
  void two_fizzbuzz_returnsTwo() {
    assertThat(cut.fizzbuzz(2)).isEqualTo("2");
  }

  @Test
  void three_fizzbuzz_returnsFizz() {
    assertThat(cut.fizzbuzz(3)).isEqualTo(FIZZ);
  }

  @Test
  void five_fizzbuzz_returnsBuzz() {
    assertThat(cut.fizzbuzz(5)).isEqualTo(BUZZ);
  }

  @Test
  void six_fizzbuzz_returnsFizz() {
    assertThat(cut.fizzbuzz(6)).isEqualTo(FIZZ);
  }

  @Test
  void ten_fizzbuzz_returnsBuzz() {
    assertThat(cut.fizzbuzz(10)).isEqualTo(BUZZ);
  }

  @Test
  void fifteen_fizzbuzz_returnsFizzBuzz() {
    assertThat(cut.fizzbuzz(15)).isEqualTo(FIZZ + BUZZ);
  }
}
