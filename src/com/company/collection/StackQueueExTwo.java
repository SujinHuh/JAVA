package com.company.collection;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class StackQueueExTwo {

    static Queue queue = new LinkedList();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        System.out.println("help 입력하면 도움말 볼 수 있다.");
        while (true) {
            System.out.print(">>");
            try {
                //화면으로부터 라인단위로 입력 받는다.
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine().trim();

                if ("".equals(input)) continue;

                if (input.equalsIgnoreCase("q")) {
                    System.exit(0);
                } else if (input.equalsIgnoreCase("help")) {
                    System.out.println(" help - 도움말 보여줍니다.");
                    System.out.println(" q or Q 프로그램 종료");
                    System.out.println("history - 최근 입력한 명령어" + MAX_SIZE + "개 보여 줍니다. ");
                } else if (input.equalsIgnoreCase("history")) {
                    int i = 0;
                    // 입력받은 명령어를 저장
                    save(input);

                    //LinkedList 내용 확인
                    LinkedList temp = (LinkedList) queue;
                    ListIterator iterator = temp.listIterator();

                    while (iterator.hasNext())
                        System.out.println(++i + "." + iterator.next());
                } else {
                    save(input);
                    System.out.println(input);
                } // if (input.equalsIgnoreCase("q"))
            } catch (Exception e) {
                System.out.println("입력오류입니다.");
            }
        }
    }

    private static void save(String input) {
        // queue save
        if (!"".equals(input)) {
            queue.offer(input);

            //queue 최대크기를 넘으면 제일 처음 입력된 것을 삭제
            if (queue.size() > MAX_SIZE) {
                queue.remove();
            }
        }
    }

}
