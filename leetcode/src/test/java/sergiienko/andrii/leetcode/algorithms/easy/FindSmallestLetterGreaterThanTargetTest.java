package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindSmallestLetterGreaterThanTargetTest {
  @Test
  public void case1() {
    assertEquals('c', new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a'));
  }
  @Test
  public void case2() {
    assertEquals('f', new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c'));
  }
  @Test
  public void case3() {
    assertEquals('f', new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'd'));
  }
  @Test
  public void case4() {
    assertEquals('j', new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'g'));
  }
  @Test
  public void case5() {
    assertEquals('c', new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'j'));
  }
  @Test
  public void case6() {
    assertEquals('c', new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'k'));
  }
}
