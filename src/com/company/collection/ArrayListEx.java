package com.company.collection;

import java.util.Collections;

public class ArrayListEx {
    public static void main(String[] args) {
        java.util.ArrayList listOne = new java.util.ArrayList(10);

        listOne.add(new Integer(5));
        listOne.add(new Integer(4));
        listOne.add(new Integer(2));
        listOne.add(new Integer(0));
        listOne.add(new Integer(1));
        listOne.add(new Integer(3));

        java.util.ArrayList listTwo = new java.util.ArrayList(listOne.subList(1,4));
        print(listOne,listTwo);

        Collections.sort(listOne); //listOne,listTwo정렬
        Collections.sort(listTwo);

        System.out.println("listOne.containsAll (listTwo) :" +
                listOne.containsAll(listTwo));

        listTwo.add("B");
        listTwo.add("C");
        listTwo.add(3,"A");
        print(listOne,listTwo);

        listTwo.set(3,"aa");//index 3 -> aa
        print(listOne,listTwo);

        //listOne listTwo 겹치는 부분 남기고 삭제 (교집합)
        System.out.println("listOne.retainAll(listTwo):"
                + listOne.retainAll(listTwo));

        print(listOne,listTwo);

        //listTow listOne 포함된 객체 삭제

        for(int i= listTwo.size()-1; i>=0; i--){
            if(listOne.contains(listTwo.get(i))){
                listTwo.remove(i); // index i인 곳에 저장된 요소 삭제
            }
            print(listOne, listTwo);
        }
    }
    static void print(java.util.ArrayList listOne, java.util.ArrayList listTwo) {
        System.out.println("listOne" + listOne);
        System.out.println("listTwo" + listTwo);

        System.out.println();
    }

}
