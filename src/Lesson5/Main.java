package Lesson5;

import java.util.Arrays;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;

    public static float[] completionArray(float[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.0f;
        }
        return array;
    }

    public static void timeTrackingSingleThread(float[] arr) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println(arr[15000]);
        System.out.println("Один поток справился за " + (System.currentTimeMillis() - start) + " миллисекунд");
    }

    public static void timeTrackingMultiThread(float[] arr) {
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        long start = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        MyThread m1 = new MyThread(a1);
        MyThread m2 = new MyThread(a2);


        try {
            m1.join();
            m2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        System.out.println(arr[15000]);
        System.out.println("Два потока справились за " + (System.currentTimeMillis() - start) + " миллисекунд");
    }

    public static void main(String[] args) {
        float[] arr = new float[size];

        timeTrackingSingleThread(completionArray(arr));
        timeTrackingMultiThread(completionArray(arr));

    }
}
