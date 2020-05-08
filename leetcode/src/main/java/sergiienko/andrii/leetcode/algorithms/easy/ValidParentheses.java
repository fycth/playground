package sergiienko.andrii.leetcode.algorithms.easy;

class ValidParentheses {
  public boolean isValid(String s) {
    if (s.isEmpty()) {
      return true;
    }
    boolean valid = false;
    Stack stack = new Stack();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '(' || c == '{' || c == '[') {
        valid = true;
        stack.push(c);
      } else {
        Character a = stack.pop();
        if (a == null
        || (a == '(' && c != ')')
        || (a == '{' && c != '}'
        || (a == '[' && c != ']'))) {
          valid = false;
          break;
        }
      }
    }
    return valid && stack.empty();
  }

  private class Stack {
    Node head;
    void push(char val) {
      Node n = new Node(val);
      n.next = head;
      head = n;
    }
    Character pop() {
      if (head == null) {
        return null;
      } else {
        char val = head.val;
        head = head.next;
        return val;
      }
    }
    boolean empty() {
      return head == null;
    }
  }
  private class Node {
    char val;
    Node next;
    Node(char val) {
      this.val = val;
    }
  }
}
