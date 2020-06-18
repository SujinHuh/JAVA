package com.company.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Queue queue = new LinkedList(); //Queue인터페이스의 구현체인 LinkedList를 사용

        stack.push("0");
        stack.push("1");
        stack.push("2");

        queue.offer("0");
        queue.offer("1");
        queue.offer("2");

        System.out.println("= 스택 =");

        while (!stack.empty()) {
            System.out.println(stack.pop());// stack print
        }

        System.out.println("= 큐 =");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // queue print
        }
    }
    /**
     stack - LIFO
     queue - FIFO

     stack은 '순차적으로 데이터를 추가하고 삭제' ArrayList 적합
     queue은 '데이터를 꺼낼때 항상 첫번째 저장된 데이터를 삭제' LinkedList (추가,삭제 용이)

     */
}
