/*
 * Name:Sana
 * Description:Sum of n natural numbers which are divisible by 3 and 5
 */
import java.util.Scanner;
public class SumOfNaturalNumbers {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter the number");
				int range=sc.nextInt();
				System.out.println("The sum of natural numbers upto "+range+" is:"+calculateSum(range));
				

			}
			private static int calculateSum(int n)
			{
				int sum=0;
				for(int i=1;i<=n;i++)
				{
					if((i%3==0)||(i%5==0))
					{
						sum+=i;
					}
				}
				return sum;

	}

}
