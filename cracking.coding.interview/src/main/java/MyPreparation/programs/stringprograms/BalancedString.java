package MyPreparation.programs.stringprograms;

import java.util.LinkedList;

public class BalancedString {

  public static void main(String[] args) {
    // String s = "[()]{}{[()()]()}";
    String s = "[(])";
    System.out.println(BalancedString.isBalanced(s));
  }

  public static boolean isBalanced(String s) {
    String[] strings = s.split("");
    // Using LinkedList as a stack with the help of push() & pop()
    LinkedList<String> stack = new LinkedList<>();

    for (int i = 0; i < strings.length; i++) {
      if (strings[i].equals("[") || strings[i].equals("{") || strings[i].equals("(")) {
        stack.push(strings[i]);
      } else if (strings[i].equals("]") || strings[i].equals("}") || strings[i].equals(")")) {
        // if string start with and closed bracket, the list will be empty, which is not balanced
        if (stack.isEmpty()) {
          return false;
          // Checking if last element pushed is equal to current element or not by using pop(): return last pushed
        } else if (!isMatching(stack.pop(), strings[i])) {
          return false;
        }
      }
    }
    if (stack.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean isMatching(String s, String s1) {
    if (s.equals("(") && s1.equals(")")) {
      return true;
    } else if (s.equals("[") && s1.equals("]")) {
      return true;
    } else if (s.equals("{") && s1.equals("}")) {
      return true;
    } else {
      return false;
    }
  }
}
