package org.example;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class ArrayOperationsIT {
  //test overloaded method sumElements with input DataProvider - not mocked
  @Test
  public void ArrayOperations_whenGoodInputFromDataProvider_thenSumIsPositive() throws Exception {
    int res = ArrayOperations.sumElements((new DataProvider().generateArray(5)));
    Assertions.assertTrue(res > 0);
  }

  @Mock
  private DataProvider dataProviderMock;
  //test overloaded method sumElements with input DataProvider - mocked
  @Test
  public void ArrayOperations_whenGoodInputFromDataProvider_thenSumIsPositive_Mock() throws Exception {
    int[] mockedArray = {3, 6, 5, 8};
    dataProviderMock = mock(DataProvider.class);
    when(dataProviderMock.generateArray(4)).thenReturn(mockedArray);
    int res = ArrayOperations.sumElements(dataProviderMock.generateArray(4));
    Assertions.assertEquals(res, 22);
  }

}
