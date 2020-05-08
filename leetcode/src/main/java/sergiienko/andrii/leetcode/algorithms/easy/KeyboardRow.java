package sergiienko.andrii.leetcode.algorithms.easy;

import java.util.*;

public class KeyboardRow {
  private Set<Character> r1 = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
  private Set<Character> r2 = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
  private Set<Character> r3 = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));

  public String[] findWords(String[] words) {
    List<String> res = new ArrayList<>();
    for (String word : words) {
      boolean f = true;
      for (int i = 0; i < word.length(); i++) {
        if (!r1.contains(word.charAt(i)) && !r1.contains((char)(word.charAt(i) + 32))) {
          f = false; break;
        }
      }
      if (f) {
        res.add(word);
        continue;
      } else {
        f = true;
      }
      for (int i = 0; i < word.length(); i++) {
        if (!r2.contains(word.charAt(i)) && !r2.contains((char)(word.charAt(i) + 32))) {
          f = false; break;
        }
      }
      if (f) {
        res.add(word);
        continue;
      } else {
        f = true;
      }
      for (int i = 0; i < word.length(); i++) {
        if (!r3.contains(word.charAt(i)) && !r3.contains((char)(word.charAt(i) + 32))) {
          f = false; break;
        }
      }
      if (f) {
        res.add(word);
      }
    }
    return res.toArray(new String[0]);
  }
}
