package org.DarshanValaJavaTraining;

public class MethodOverLoading {

    public void displayStudent(String name, int rollNo){
        System.out.println("Name: " + name + " roll number: "+ rollNo);
    }
    public void displayStudent(String name, int rollNo , int std){
        System.out.println("Name: " + name + " roll number: "+ rollNo + " std: "+std);
    }

    public static void main(String[] args) {
        MethodOverLoading m1 = new MethodOverLoading();
        m1.displayStudent("Darshan", 1);
        m1.displayStudent("Ayush" , 2, 14);
    }
}
