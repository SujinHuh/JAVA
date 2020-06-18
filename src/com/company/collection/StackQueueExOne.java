package com.company.collection;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackQueueExOne {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java  \"Expression\"");
            System.out.println("Example:java \"((2+3)*1)+3\"");
            System.exit(0);
        }

        System.out.println("hi");
        Stack stack = new Stack();
        String expression = args[0];

        System.out.println("expression" + expression);

        try {
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);

                if (ch == '(') {
                    stack.push(ch + "");
                } else if (ch == ')') {
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                System.out.println("괄호가 일치함");
            } else {
                System.out.println("괄호가 일치하지 않습니다.");
            }
        } catch (EmptyStackException e) {
            System.out.println("괄호가 일치하지 않습니다.");
        }

    }
}
