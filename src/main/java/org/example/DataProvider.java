package org.example;

import java.util.Random;

public class DataProvider {
  //a class to simulate the retrieval of existing arrays for instance from a persistence layer (DB)

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
