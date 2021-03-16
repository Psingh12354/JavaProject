/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    array obj=new array();
		while(true){
			System.out.println("Select the option:");
			
			System.out.println("1. Insert");
			
			System.out.println("2. Search");
			
			System.out.println("3. Delete");
			
			System.out.println("4. Display");
			
			System.out.println("5. Exit");
			Scanner sc1 = new Scanner(System.in);
			
			int choice = sc1.nextInt();
			switch (choice) {
			    case 1:
			        obj.Insert();
			        break;
			    case 2:
			        obj.Search();
			        break;   
			     case 3:
			         obj.Delete();
			        break;
			      case 4: 
			          obj.Display();
			          break;
			      case 5:
		         		System.exit(0);
			
			    	break; 
			}
			}
	}
}
class array{
     Scanner sc=new Scanner(System.in);
     ArrayList<String> arr=new ArrayList<String>(); 
    void Insert(){
        String inp=sc.nextLine();
        arr.add(inp);
    }
    void Search(){
        String inp=sc.nextLine();
        System.out.println(arr.contains(inp));
    } 
    void Delete(){
        String inp=sc.nextLine();
        arr.remove(inp);
    }
    void Display(){
        Iterator itr=arr.iterator();
		{
		    while(itr.hasNext())
		    {
		        System.out.println(itr.next());
		    }
		}
    }
}
