package org.example;

public class ArrayOperations {

  //METHOD: sumElements(int[] elements)
  //requirements
  //empty array returns -1
  //only allow positive integer elements (throws Exception otherwise)
  //return the sum of numbers in any other case
  public static int sumElements(int[] elements) throws NegativeInputException {
    if (elements.length == 0) {
      return -1;
      }
    for (int i = 0; i < elements.length; i++) {
      if (elements[i] < 0) {
        throw new NegativeInputException("Negative input in the array at position: " + i + ": " + elements[i] + " - only non negative values are allowed");
      }
    }

    int sum = 0;
    for (int element : elements) {
      sum += element;
    }
    return sum;
  }

  //2. METHOD: findMax(int[] elements)
  //requirements
  //empty array returns -1
  //only allow positive integer elements (throws Exception otherwise)
  //return the value of the biggest element in the array in any other case

  //3. METHOD: findMaxPosition(int[] elements)
  //requirements
  //empty array returns -1
  //only allow positive integer elements (throws Exception otherwise)
  //return the index (position in the array, starting from 0) of the biggest element in the array in any other case

}
