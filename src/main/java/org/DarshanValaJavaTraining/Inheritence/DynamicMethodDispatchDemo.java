package org.DarshanValaJavaTraining.Inheritence;

public class DynamicMethodDispatchDemo {
    public static void main(String[] args) {
        Aminal animal = new Aminal();
        Cat cat = new Cat();

        animal.eat();
        cat.eat();
    }
}
