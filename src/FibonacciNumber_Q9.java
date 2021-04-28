//9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

public class FibonacciNumber_Q9 {
    public static void main(String[] args) {

        int count = 8, num1 = 1, num2 = 1;
        System.out.print("Fibonacci Series of "+count+" numbers: ");

        for (int i = 1; i <= count; ++i)//for loop
        {
            System.out.print(num1+" ");

            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }
}















