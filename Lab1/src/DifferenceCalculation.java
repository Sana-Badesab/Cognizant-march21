/**
 * Name:Sana
 * Description:A program to calculate difference between sum of squares and square of sums
 *
 */
import java.util.Scanner;
import java.lang.Math;
public class DifferenceCalculation {

	public static void main(String[] args) {
		      Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter the number");
				int range=sc.nextInt();
		        System.out.println("The difference is:"+DifferenceCalculation(range));
			}
		    private static int DifferenceCalculation(int n)
		    {
		    	int sum=0;
		    	int sumOfNumbers=0,sumOfSquares=0;
		    	sumOfNumbers=(n*(n+1)/2);
		    	sumOfSquares=((n*(n+1)*(2*n+1))/6);
		    	sum=(sumOfNumbers*sumOfNumbers)-sumOfSquares;
		    	return sum;
	}

}
