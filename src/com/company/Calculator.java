package com.company;

public class Calculator {

  public int sum(int num1, int num2){
    if (num1 > 100 || num2 > 100){
      throw new IllegalArgumentException();
    }
    int sum = num1 + num2;
    return sum;
  }
}
