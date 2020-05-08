package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseOnlyLettersTest {
  @Test
  public void case1() {
    assertEquals("dc-ba", new ReverseOnlyLetters().reverseOnlyLetters("ab-cd"));
  }
  @Test
  public void case2() {
    assertEquals("j-Ih-gfE-dCba", new ReverseOnlyLetters().reverseOnlyLetters("a-bC-dEf-ghIj"));
  }
  @Test
  public void case3() {
    assertEquals("Qedo1ct-eeLg=ntse-T!", new ReverseOnlyLetters().reverseOnlyLetters("Test1ng-Leet=code-Q!"));
  }
}
