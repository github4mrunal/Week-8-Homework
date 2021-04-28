import com.sun.org.apache.xpath.internal.objects.XNumber;

/*11. Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative
NOTE: The method getEvenDigitSum should be defined as public static
*/
public class EvenDigitSum_Q11 {
    public static int getEvenDigitSum(int number) {
        int sum, even = 0;


        for (sum = 0; number != 0; number /= 10) {//for loop sum of even
            even = number % 10;
            if (even % 2 == 0)
                sum += even;
        }
        if (even < 0) {
            return -1;
        }
        return sum;// return statement
    }

    public static void main(String[] args) {
        //  System.out.println("Sum of even number is : " );
        System.out.println(getEvenDigitSum(-22));

    }


}
