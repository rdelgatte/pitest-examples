# Mutation testing with Pitest

This basic project aims to highlight benefits of mutation testing in Java using [Pitest](http://pitest.org)

## 1. RangeValidator
It assesses whether a provided input number is between 0 and 100 like below: 

```
boolean isValid(int input) {
  return input > 0 && input <= 100;
}
```

Adding some unit tests and Pitest, we should cover multiple cases including limit test case which means when provided value is either 0 and 100.

You can see more about this case (step by step) in the following [introduction to Mutation Testing](https://rdelgatte.github.io/pitest-presentation/).
 