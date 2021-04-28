import java.util.Scanner;

/*8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@
*/
public class TriangleLoops_Q8 {
    public static void main(String[] args) {
    int i,j,n;
        System.out.print("Input number of rows : ");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();

        for(i=1;i<=n;i++)//outer loop
    {
        for(j=1;j<=i;j++)//inner loop
            System.out.print("@");

        System.out.println("");
    }
}






}
