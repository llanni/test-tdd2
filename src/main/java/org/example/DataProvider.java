package org.example;

import java.util.Random;

public class DataProvider {
  public int[] generateArray(int length) throws Exception {
    if (length <= 0) {
      throw new NegativeInputException("");
    }
    int[] res = new int[length];
    for (int i = 0; i < res.length; i++) {
      res[i] = (new Random()).nextInt(101);
    }
    return res;
  }

}
