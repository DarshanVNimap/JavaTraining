package org.DarshanValaJavaTraining.GenericClassAndMethodTask;

public class Demo {
    public static void main(String[] args) {

        //Store Integer value
        GenericClass<Integer> g1 = new GenericClass<>();
        g1.setValue(1);
        g1.setValue(2);

        int value = g1.getValue(1);
        System.out.println(value);


        // Store String value
        GenericClass<String> g2 = new GenericClass<>();
        g2.setValue("Darshan");
        g2.setValue("Vala");

        System.out.println(g2.getValue(0));
    }
}
