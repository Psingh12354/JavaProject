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
            	System.out.println("Enter first number");
			    int inp1=sc.nextInt();
			    System.out.println("Enter second number");
			    int inp2=sc.nextInt();
			    System.out.println("Division value is ");
			    double div=division(inp1,inp2);
			    System.out.println(div);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
	public static double division(int inp1, int inp2) throws ArithmeticException {
		return inp1 / inp2;
	}
}
