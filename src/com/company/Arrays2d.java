package com.company;

public class Arrays2d {
    public static void main(String[] args) {
        int arr[][] = new int[][]{

                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        for (int i = 0; i < 4; i++) { ////this will for rows values

            int s=0;

            for (int j = 0; j < 3; j++) {  ////this will for column values

                s=s+arr[j][i];
            }
            System.out.println(s);
        }

    }
}


//print elements which are on the borders 1st row or last row 1st col or last col
