package org.DarshanValaJavaTraining.CollectionFramework;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {

        //Not be use premitive dataType
        List<String> names = new ArrayList<>();
        names.add("Darshan");
        names.add("Vala");
        names.add("Ayush");
        System.out.println("-----------Array List-------------");
        // Random access possible
        System.out.println(names.get(0));
        names.remove(0);
        for (String name : names) {
            System.out.println(name);
        }

        // LinkedList Demo

        List<Integer> salary = new LinkedList<>();
        salary.add(12000);
        salary.add(13000);
        salary.addFirst(10000);
        salary.addLast(14000);
        System.out.println("-----------Linked List-------------");
        System.out.println(salary);
        System.out.println(salary.get(2));
        System.out.println(salary.getFirst());
        salary.removeFirst();
        System.out.println(salary);

        //Stack Demo

        Stack<String> items = new Stack<>();
        items.push("Banana");
        items.push("Apple");
        items.push("Lichi");

        System.out.println("-----------Stack-------------");
        System.out.println(items);
        System.out.println(items.isEmpty());
        System.out.println(items.pop());
        System.out.println(items.peek());


    }
}
