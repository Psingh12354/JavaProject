import java.lang.*;
import java.util.*;
public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		try{ //try always with catch or finally(block)
		int k=i/0; //object of exception class
		System.out.println(k+" "+"Fine");
		}
//		catch(ArrayIndexOutOfBoundsException e){//e is object
//			System.out.println("Exception is handled and exception is"+e);
//		}
//		catch(ArithmeticException e1){ 
//			System.out.println("At"+e1);
//		} //after there will be catch and finally only nothing else
		finally{ //all the cruicial thing use in finally block
			System.out.println("Hi finally");
		}
		// you cannot declare parent exception than further child exception it will give you compiler time error
		
	}

}
