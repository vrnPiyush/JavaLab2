package unit2;

import java.util.Arrays;
import java.util.Scanner;


public class Array {

	
	  public static void main(String[] args) {
		  int[][] arr = new int[3][3];
		  Scanner myObj = new Scanner(System.in);
		  
		  for(int i=0;i<3;i++)
		  {
			  for(int j=0;j<arr[i].length;j++)
			  {
				  arr[i][j]=myObj.nextInt();
			  }  
		  }
		  
		  System.out.println(Arrays.deepToString(arr));
		  
		  
	  }
}
