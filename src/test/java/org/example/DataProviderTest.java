package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DataProviderTest {
  @Test
  public void DataProvider_whenInputIsNegative_thenThrowNegativeInputException() {
    int input = -7;
    DataProvider dataProvider = new DataProvider();
    assertThrows(NegativeInputException.class, () -> dataProvider.generateArray(input));
  }

  @Test
  public void DataProvider_whenInputIsZero_thenThrowNegativeInputException() {
    int input = 0;
    DataProvider dataProvider = new DataProvider();
    assertThrows(NegativeInputException.class, () -> dataProvider.generateArray(input));
  }

  @Test
  public void DataProvide_whenInputIsPositive_thenGenerateRandomArray() throws Exception {
    int input = 4;
    DataProvider dataProvider = new DataProvider();
    int[] res = dataProvider.generateArray(input);
    assertEquals(res.length, 4);
  }

  @Test
  public void DataProvide_whenInputIsPositive_thenGenerateRandomArrayWithNotNegativeNumbers() throws Exception {
    int input = 5;
    DataProvider dataProvider = new DataProvider();
    int[] res = dataProvider.generateArray(input);
    for (int i = 0; i < input; i++)
      assertTrue(res[i] >= 0);
  }
}