package org.DarshanValaJavaTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StaticMethodAndVariableTask {

    static  String[] movieList = {"Jawan" , "End game"};

    static  void getVideoList(){
        for(String movie:movieList){
            System.out.println(movie);
        }
    }

    public static void main(String[] args) {
        getVideoList();

        movieList[0] = "Hera Pheri";

        System.out.println("After replace movie");
        getVideoList();
    }
}
