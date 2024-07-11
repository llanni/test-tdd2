package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayOperationsTest {
  @Test
  public void sumElements_whenEmptyInput_thenReturnMinusOne() throws Exception {
    int[] input = {};
    int result = ArrayOperations.sumElements(input);
    assertEquals(-1, result);
  }

  @Test
  public void sumElements_whenNegativeInput_thenThrowNegativeInputException() {
    int[] input = {3, -1, 0};
    assertThrows(NegativeInputException.class, () -> ArrayOperations.sumElements(input));
  }

  @Test
  public void sumElements_whenNonNegativeInputs_thenReturnSum() throws Exception{
    int[] input = {3, 8, 0, 2};
    int result = ArrayOperations.sumElements(input);
    assertEquals(13, result);
  }

  @Test
  public void sumElements_whenNonNegativeInputs_thenReturnSum2() throws Exception{
    int[] input = {15, 8, 0, 2, 22, 34, 1, 0, 10};
    int result = ArrayOperations.sumElements(input);
    assertEquals(92, result);
  }
}
