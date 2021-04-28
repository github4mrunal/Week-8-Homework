//2. -Read the numbers from the console entered by the user and print the minimum
//and maximum number the user has entered.


import java.util.Scanner;

public class MinAndMaxInputChallenge_Q2 {
    public static void getMinMaxNumbers() {//create method
        Scanner obj = new Scanner(System.in);//create object for scanner
        int i = 0;//all are variables
        int userInput;
        int maxNumber = 0;
        int minNumber = 0;

        while (true) {//condition
            int cnt = i;
            System.out.println("Enter Number"+(cnt+1)+":");
            if (obj.hasNextInt()) {
                userInput = obj.nextInt();
                if (i == 0) {
                    minNumber = userInput;
                    maxNumber = userInput;
                } else {
                    if (userInput < minNumber) {
                        minNumber = userInput;
                    }
                    if (userInput > maxNumber) {
                        maxNumber = userInput;
                    }
                }
                i++;
            } else {
                System.out.println("Invalid Number.");//message for invalid number
                obj.next();
                break;//we used break bcoz we want to stop when user enter the invalid number
            }
        }
        System.out.println("Minimum Number is:" + minNumber);//print the minimum number
        System.out.println("Maximum Number is:" + maxNumber);//print the maxnumber
    }

    public static void main(String[] args) {//in main method we are calling static method
        getMinMaxNumbers();

    }


}
