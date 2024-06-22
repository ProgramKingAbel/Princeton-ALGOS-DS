package start;

import java.util.Arrays;

public class Learn_Arr {
    public static void main(String [] args) {
        // 1. Creating the array with the long form

        // declare the array
        double[] a;

        // create the array
        a = new double[5];

        for (int i = 0; i < 5; i++) {
            a[i] = 0.0;
        }

        System.out.println(Arrays.toString(a));

        // 2. Creating an array with the short form
//        boolean[] b = new boolean[2];
        double[] b = new double[5];
        System.out.println(Arrays.toString(b));

        // 3.
        int[] c = {1, 2, 3, 5, 10};
        System.out.println(Arrays.toString(c));

        // a multidimensional array -> an array of one dimensional arrays
        double[][] d = new double[3][2];
        System.out.println(Arrays.deepToString(d));

        int[][][] numbers = {{{1,2,3}, {4,5,6}, {7,8,9}}};
        System.out.println(Arrays.deepToString(numbers));

        int[][][] nums = new int[2][3][4];
        System.out.println(Arrays.deepToString(nums));

        int n = c.length;
        for (int i = 0; i < n/2; i++) {
            int temp = c[i];
            c[i] = c[n-1-i];
            c[n-i-1] = temp;
        }
        System.out.println(Arrays.toString(c));


    }
}

