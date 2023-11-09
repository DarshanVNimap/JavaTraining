package org.DarshanValaJavaTraining;

public class TypeCastingDemo {
    public static void main(String[] args) {

        // number to number type casting
        double rate = 2.9;
        int principalAmount = 12_000;
        int year = 3;

        int simpleInterest = (int) (principalAmount*year*rate)/100;

        System.out.println("Simple interest: "+simpleInterest);

        // String to int

        String num1 = "1321";
        int num = Integer.parseInt(num1);

        System.out.println(num);
    }
}

