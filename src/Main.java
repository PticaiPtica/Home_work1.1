import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {-5, 0, 1, 1, 2, 3, 6, 8, 22, 45, 678};
        int[] arr2 = {-10, 2, 3, 6, 7, 7, 7, 9, 11, 1000, 1010, 1100};


        int[] arr3 = twoArr(arr, arr2);
        System.out.println(Arrays.toString(arr3));
        System.out.println("Commit");
//
    }


    public static int[] twoArr(int[] arr1, int[] arr2) {

        int[] arrRes = new int[arr1.length + arr2.length];
        int mesto = 0;
        for (int i = 0; i < (Math.max(arr1.length, arr2.length)); i++) {
            try {
                int a = arr1[i];

                int b = arr2[i];


                if (a > b) {
                    arrRes[mesto] = b;
                    arrRes[mesto + 1] = a;

                } else {
                    arrRes[mesto] = a;
                    arrRes[mesto + 1] = b;

                }
                mesto = mesto + 2;
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }


        return arrRes;
    }

}