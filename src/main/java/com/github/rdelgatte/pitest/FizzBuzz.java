package com.github.rdelgatte.pitest;

import java.util.stream.IntStream;
import org.springframework.util.StringUtils;

class FizzBuzz implements Runnable {

  final static String BUZZ = "buzz";
  final static String FIZZ = "fizz";
  private final static int BUZZ_THRESHOLD = 5;
  private final static int FIZZ_THRESHOLD = 3;

  public static void main(String[] args) {
    new Thread(new FizzBuzz()).start();
  }

  String fizzbuzz(int input) {
    String output = "";
    output += input % FIZZ_THRESHOLD == 0 ? FIZZ : "";
    output += input % BUZZ_THRESHOLD == 0 ? BUZZ : "";
    return StringUtils.isEmpty(output) ? String.valueOf(input) : output;
  }

  public void run() {
    IntStream.range(1, 100).forEach(i -> System.out.println(fizzbuzz(i)));
  }
}
