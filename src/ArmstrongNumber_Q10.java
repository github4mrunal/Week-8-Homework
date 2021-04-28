/*10. Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153

 */

import java.util.Scanner;

public class ArmstrongNumber_Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number to check Armstrong number : ");
        int c = 0,a,temp;
        int n = input.nextInt();
        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;//remainder formula
            c=c+(a*a*a);//armstrong formula
        }
        if(temp==c) {
            System.out.println("Armstrong number");
        }   else
            System.out.println("Not an Armstrong number");
        }
    }





