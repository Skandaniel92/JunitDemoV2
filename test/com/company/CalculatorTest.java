package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  @Test
  void sum() {
    //arrange
    Calculator calculator = new Calculator();

    //act - kalder den metode vi ønsker at teste
    int  actual = calculator.sum(1,2);

    //assert
    int expected = 3;

    //Får vi det vi forventer?
    assertEquals(expected, actual);

  }

  @Test
  void sumNegativeNumber() {
    //arrange
    Calculator calculator = new Calculator();

    //act - kalder den metode vi ønsker at teste
    int  actual = calculator.sum(-1,-2);

    //assert
    int expected = -3;

    //Får vi det vi forventer?
    assertEquals(expected, actual);

  }

  @Test
  void sumVeryLargeNumber() {
    //arrange
    Calculator calculator = new Calculator();

    //act + assert - kalder den metode vi ønsker at teste
    assertThrows(IllegalArgumentException.class, () ->{
      calculator.sum(Integer.MAX_VALUE, Integer.MAX_VALUE);
    });


  }


  @Test
  void sumLargeNumber() {
    //arrange
    Calculator calculator = new Calculator();

    //act + assert - kalder den metode vi ønsker at teste
    assertThrows(IllegalArgumentException.class, () ->{
      calculator.sum(105, 100);
    });


  }

}