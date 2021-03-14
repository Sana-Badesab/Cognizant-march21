
import java.io.*;
import java.util.Scanner;
public class Trafficlight2 {
	public static void main(String args[]) {
    System.out.println("Enter a number from 1 to 3 to display signal: ");
    System.out.println("1.Red"+"\n"+"2.Yellow"+"\n"+"3.Green");
	Scanner sc=new Scanner(System.in);
	int input=sc.nextInt();
	
	if(input==1)
	{
		System.out.println("STOP");
	}
	else if(input==2) {
		System.out.println("READY");
	}
	else if(input==3) {
		System.out.println("GO");
		}
	else
	{
		System.out.println("Invalid Input");
	}
	}
}
