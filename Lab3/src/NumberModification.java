/**
 * Name:Sana
 * Description:A method that accepts a number and modifies it such that each of the digit in the newly formed number is equal to the difference between two consecutive  digits in original number
 *
 */
import java.util.Scanner;
import java.lang.Math;
public class NumberModification {

	public static void main(String[] args) {
		
		        Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter the number");
				int number=sc.nextInt();
				System.out.println("the modified number is "+modifyNumber(number));
			}
		    private static int modifyNumber(int pNumber)
		    {
		    	String str=Integer.toString(pNumber);
		    	int output=0;
		    	for(int i=0;i<str.length()-1;i++)
		    	{
		    		int diff=str.charAt(i)-str.charAt(i+1);
		    		output=output*10+Math.abs(diff);
		    	}
		    	output=output*10+(str.charAt(str.length()-1))-48;
		    	return output;
		    }
		
}
