/**
 * Name:Sana
 * Description:A program to create a method to create the mirror image of a string.
 */
		import java.util.Scanner;

		public class MirrorImage {

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				
				//Enters a string needed to reverse
				System.out.println("Enter the String");
				String str=sc.next();
				System.out.println(getImage(str));
			    
			}
		    private static String getImage(String pStr)
		    {
		    	//String reverseStr="";
		    	//for(int i=pStr.length()-1;i>=0;i--)
		    		//reverseStr+=pStr.charAt(i);
		    	StringBuffer reverseStr=new  StringBuffer(pStr);
		    	reverseStr.reverse();
		    	return pStr+"|"+reverseStr;
		    
		    }
		}
