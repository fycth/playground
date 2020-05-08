package sergiienko.andrii.leetcode.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LicenseKeyFormattingTest {
  @Test
  public void case1() {
    assertEquals("5F3Z-2E9W", new LicenseKeyFormatting().licenseKeyFormatting("5F3Z-2e-9-w", 4));
  }

  @Test
  public void case2() {
    assertEquals("2-5G-3J", new LicenseKeyFormatting().licenseKeyFormatting("2-5g-3-J", 2));
  }

  @Test
  public void case3() {
    assertEquals("A-AA", new LicenseKeyFormatting().licenseKeyFormatting("aaa", 2));
  }
}
