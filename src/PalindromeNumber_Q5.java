/*Q5. Palindrome Number
//Write a method called isPalindrome with one int parameter called number.
//The method needs to return a boolean.
//It should return true if the number is a palindrome number otherwise it should return false.
//Check the tips below for more info about palindromes.
//Example Input/Output
//isPalindrome(-1221); → should return true
//isPalindrome(707); → should return true
//isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.
//Tip: What is a Palindrome number? A palindrome number is a number which when reversed is equal
//to the original number. For example: 121, 12321, and 1001 etc.
//Tip: Logic to check a palindrome number
//Find the reverse of the given number. Store it in some variable say reverse. Compare the number with
//reverse.
//If both are the same then the number is a palindrome otherwise it is not.
*/

 public class PalindromeNumber_Q5 {
     public static boolean isPalindrome(int number) {
         int lastDigit;
         int temp;
         int reverse = 0;
         boolean result;
         int absNumber  = Math.abs(number); //Converting number to positive (Absolute)
         temp = absNumber;
         result = true;
         while (temp > 0) {
             lastDigit = temp % 10;  //getting remainder
             reverse = (reverse * 10) + lastDigit;
             temp = temp / 10;
         }
         if (absNumber == reverse) {
             result = true;
         } else
             result = false;

         return result;

     }


     public static void main(String[] args) {
         boolean res = isPalindrome(987);
         if (res == true)
             System.out.println("The number is Palindrome");
         else
             System.out.println("The number is not Palindrome");

     }
 }







