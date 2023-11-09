package org.DarshanValaJavaTraining.PackageUseTask;

public class Student {

    private int rollNo;
    private String name;
    private int std;

    public Student(int rollNo, String name, int std) {

        setName(name);
        setRollNo(rollNo);
        setStd(std);

    }

    public Student(String name , int rollNo){
        setName(name);
        setRollNo(rollNo);
        setStd(12);
    }

    public int getRollNo() {
        return rollNo;
    }

    private void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getStd() {
        return std;
    }

    private void setStd(int std) {
        this.std = std;
    }
}
