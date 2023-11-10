package org.DarshanValaJavaTraining.CollectionFramework;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {

        System.out.println("-----------Priority Queue-------------");

        PriorityQueue<Integer> list  = new PriorityQueue<>();
        list.add(10);
        list.add(4);
        list.add(3);

        System.out.println(list.peek());
        System.out.println(list.poll());

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.println("-----------Array Deqeue-------------");

        ArrayDeque<String> employee = new ArrayDeque<>();
        employee.add("Shubhang");
        employee.add("Darshan");
        System.out.println(employee);
        employee.addFirst("Ayush");
        employee.add("Darshan");
        System.out.println(employee);
        employee.removeLast();

        System.out.println(employee);

    }
}
