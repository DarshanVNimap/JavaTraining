package org.DarshanValaJavaTraining.CollectionFramework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {

        System.out.println("-----------Hash Map-------------");
        HashMap<Integer , String> employee = new HashMap<>();
        employee.put(1, "Shushant");
        employee.put(2, "Darshan");
        employee.put(3,"Ayush");

        System.out.println(employee.get(1));
        employee.remove(1);
        for(int id : employee.keySet()){
            System.out.print(employee.get(id)+" ");
        }
        System.out.println();
        System.out.println("--------------Hash Table---------------");
        Hashtable<String , Integer> student = new Hashtable<>();
        student.put("Darshan" , 12_000);
        student.put("Ayush", 20_000);
        student.put("Rahul",30_000);

        System.out.println(student.get("Rahul"));
        student.remove("Ayush");
        for(String name:student.keySet()){
            System.out.println(student.get(name));
        }

    }
}
