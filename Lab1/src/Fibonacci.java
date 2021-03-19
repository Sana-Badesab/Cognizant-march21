/*
 * Name:Sana
 * Description:A program that prints fibonacci numbers till the given n value
 */

import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int count=sc.nextInt();
	int n1=0,n2=1,n3,i;
	System.out.println(n1+"\n"+n2);
	for(i=2;i<count;i++)
	{
		n3=n1+n2;
		System.out.println(" "+n3);
		n1=n2;
		n2=n3;
	}
 }
}
