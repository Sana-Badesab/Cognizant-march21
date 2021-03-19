/**
 * Name:Sana
 * Description: A program that reads a line of integers and then displays each integer and sum of all integers
 */

import java.util.StringTokenizer;
import java.util.Scanner;
public class SumOfIntegers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.next();
		StringTokenizer st=new StringTokenizer(str,",");
		int sum=0;
		while(st.hasMoreTokens())
		{
			sum+=Integer.parseInt(st.nextToken());
		}
		System.out.println("The sum of integers:"+sum);		
	}
		
}
