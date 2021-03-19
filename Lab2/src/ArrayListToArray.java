/*
 * Name:Sana
 * Description:Program to convert Array list to an array
 */
import java.util.ArrayList;
public class ArrayListToArray {

	public static void main(String[] args) {
		  ArrayList<Integer> list= new ArrayList<>();
		    list.add(1);
		    list.add(2);
		    list.add(8);
            list.add(9);
		    // Create a new array of String type
		    Integer [] arr = new Integer[list.size()];

		    // Convert ArrayList into the string array
		    list.toArray(arr);
		    System.out.print("Array: ");
		    for(int i=0;i<arr.length;i++) {
		      if(i==arr.length-1)
		      System.out.print(arr[i]);
		      else
			      System.out.print(arr[i]+",");
		    }

     }

}


