//15. Display left angle triangle of * using nested for loop

import java.util.Scanner;

public class LeftTriangleLoop_Q15 {
    public static void LeftTriangle() {

        int i, j,  k;
        int n=5;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for (i = 1; i <= n; i++) {
            for (k = 1; k <= i; k++) {

                    System.out.print("*");
                }
                    System.out.println("\n");

            }
        }
            public static void main (String[]args){
            LeftTriangle();
        }

    }










