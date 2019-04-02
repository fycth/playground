package sergiienko.andrii.leetcode.algorithms.easy;

public class OneBitAndTwoBitCharacters {
  public boolean isOneBitCharacter(int[] bits) {
    if (bits.length == 1 && bits[0] == 0) return true;
    int i = 0;
    while (true) {
      if (bits[i] == 1) {
        i += 2;
        if (i >= bits.length) return false;
      } else {
        i++;
        if (i == bits.length) return true;
      }
    }
  }
}
