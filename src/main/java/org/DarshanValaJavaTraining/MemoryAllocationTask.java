package org.DarshanValaJavaTraining;
import org.DarshanValaJavaTraining.PackageUseTask.Student;

public class MemoryAllocationTask {
    public static void main(String[] args) {
        int rollNo = 1;
        String name = "Darshan";
        int std = 12;

        Student s1 = new Student(rollNo , name, std);

        System.out.println("Student1 name : "+ s1.getName()+", rollno : "+ s1.getRollNo()+", std : "+ s1.getStd());

        Student s2 = new Student("Vala" , 13);

        System.out.println("Student2 name : "+ s2.getName()+", rollno : "+ s2.getRollNo()+", std : "+ s2.getStd());


    }
}

