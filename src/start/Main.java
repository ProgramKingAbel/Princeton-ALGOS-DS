package start;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        //primitive types
        byte age = 30;
        short mileage = 10000;
        // int viewsCount = 123_456_789;
        long viewsCount = 3_123_456_789L;
        double price = 10.99;
        float cost = 20.00F;
        char letter = 'A';
        boolean isEligible = true;

        // reference types

        Date now = new Date();
        System.out.println(now);

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point2.x = 4;
        System.out.println(point2.x);

//        String message = new String("Hello World");
        // Strings and escape sequences
        String message = "Hello \"world\"" + "!!";
        String dir_path = "c:\t\\Windows\\user\n";


        System.out.println(message.toLowerCase());
        System.out.println(dir_path);

        // Arrays
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;

//        System.out.println(Arrays.toString(numbers));

        int[] numbers = { 2, 3, 1, 4, 5 };
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // multidimensional arrays
        int[][] cubes = new int[2][3];
        cubes[0][0] = 1;
        System.out.println(Arrays.deepToString(cubes));

        int [][][] numArr = new int[2][3][4];
        numArr[0][1][2] = 3;
        System.out.println(Arrays.deepToString(numArr));

        int [][][] numbers2 = {{{1, 2, 3}, {4, 5, 6}}};
        System.out.println(Arrays.deepToString(numbers2));

        //constants
        final float PI = 3.14F;

        double result = (double)10 / 3;
        System.out.println(result);

        //increment -> post fix and prefix
        int x = 1;
        System.out.println(x);
        int y = x++; // y is 1
//        int y = ++x; ----> y is 2
        System.out.println(x);
        System.out.println(y);

        // implicit casting
        // byte > short > int > long > float > double
        // Implicit casting happens only when we dont lose data
        short a = 1;
        int b = 2;
        int result2 = a + b;
        System.out.println(result2);

        // explicit casting
        double j = 1.1;
        int k = (int)j + 2;
        System.out.println(k);

        // wrapper classes
        String num = "1";
        int d = Integer.parseInt(num) + 4;
        System.out.println(d);

        // The math class
//        int c = Math.round(1.6F);
//        int c = (int)Math.ceil(1.1F);
        int c = (int)Math.floor(1.9F);
        System.out.println(c);



    }
}