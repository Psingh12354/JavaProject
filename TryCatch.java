/**************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

***************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		try{
		   	int[] arr=new int[3];
		   	System.out.println("Enter array value");
			for(int i=0;i<3;i++){
			    int inp=sc.nextInt();
			    arr[i]=inp;
			}
			System.out.println("Enter number");
		    int i=sc.nextInt();
			System.out.println(arr[i]);

		}
		catch(NumberFormatException e){
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
	}
}
