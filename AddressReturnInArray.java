import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[]={1,4,34,56,7};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int address=0;
		for(int i=0;i<arr.length;i++){
		    if(n==arr[i]){
		        address=i;
		        break;
		    }
		    else{
		        address=-1;
		    }
		}
		System.out.println(address);
	}
}
