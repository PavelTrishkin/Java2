package Lesson2;

public class MyArraySizeException extends Exception {

    public MyArraySizeException() {
    }

    public MyArraySizeException(String message){
        System.out.println(message);
    }
}
