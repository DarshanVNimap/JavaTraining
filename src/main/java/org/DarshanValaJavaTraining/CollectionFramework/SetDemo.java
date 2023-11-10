package org.DarshanValaJavaTraining.CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        System.out.println("-----------HashSet-------------");

        HashSet<Integer> set = new HashSet<>();
        set.add(3);
        set.add(19);
        set.add(1);
        set.add(19);

        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set);

        System.out.println("-----------LinkedSet-------------");

        LinkedHashSet<String> animal = new LinkedHashSet<>();
        animal.add("Zebra");
        animal.add("Cat");
        animal.add("Zebra");
        animal.add("Dog");


        System.out.println(animal);
        System.out.println(animal.remove("Zebra"));
        System.out.println(animal.size());
        System.out.println(animal);

        System.out.println("-----------Tree-------------");

        TreeSet<Integer> ids = new TreeSet<>();
        ids.add(10);
        ids.add(6);
        ids.add(1);

        System.out.println(ids);;
        System.out.println(ids.reversed());



    }
}
