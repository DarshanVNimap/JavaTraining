package org.DarshanValaJavaTraining.GenericClassAndMethodTask;

public class GenericClass<T>{

    T[] nu1 =(T[]) new Object[10];
    int index = 0;

    public void setValue(T t){
        nu1[index++] = t;
    }

    public T getValue(int in){
        return nu1[in];
    }
}
