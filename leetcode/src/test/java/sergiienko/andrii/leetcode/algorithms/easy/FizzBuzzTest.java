package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
  @Test
  public void case1() {
    List<String> actualList = new FizzBuzz().fizzBuzz(15);
    List<String> expectedList = new ArrayList<>();
    expectedList.add("1");
    expectedList.add("2");
    expectedList.add("Fizz");
    expectedList.add("4");
    expectedList.add("Buzz");
    expectedList.add("Fizz");
    expectedList.add("7");
    expectedList.add("8");
    expectedList.add("Fizz");
    expectedList.add("Buzz");
    expectedList.add("11");
    expectedList.add("Fizz");
    expectedList.add("13");
    expectedList.add("14");
    expectedList.add("FizzBuzz");

    assertEquals(expectedList.size(), actualList.size());

    for (int i = 0; i < expectedList.size(); i++) {
      assertEquals(expectedList.get(i), actualList.get(i));
    }
  }
}
