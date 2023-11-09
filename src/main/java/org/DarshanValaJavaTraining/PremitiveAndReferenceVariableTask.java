package org.DarshanValaJavaTraining;

import java.awt.*;

public class PremitiveAndReferenceVariableTask {
    public static void main(String[] args) {

        // Premitive variable
        // example : int , long, double, float, String, char, short

        int salary1 = 12000;
        int salary2  = salary1;

        salary1 = 15000;

        System.out.println("Salary1 value: "+salary1);
        System.out.println("Salary2 value: "+salary2);


        //Reference Variable

        Point point1 = new Point(10,12);
        var point2 = point1;
        point1.x = 120;

        System.out.println("Point1 : "+point1);
        System.out.println("Point2 : "+point2);

    }
}
