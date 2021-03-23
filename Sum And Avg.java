/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		try{
		   	int[] arr=new int[4];
		   	int sum=0;
		   	System.out.println("Enter array value");
			for(int i=0;i<4;i++){
			    int inp=sc.nextInt();
			    arr[i]=inp;
			    sum+=arr[i];
			}
			float avg=sum/3;
			System.out.println("Sum "+sum);
			System.out.println("Avg "+avg);

		}
		catch(NumberFormatException e){
			System.out.println(e);
		}
		catch(Exception e){
		    System.out.println(e);
		}
	}
    
}
