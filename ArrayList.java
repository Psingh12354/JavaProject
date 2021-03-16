import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List li=(List) new ArrayList(); //here list is parent where inheritinh arraylist
		ArrayList arr=new ArrayList(); //it implement the list interface arraylist store duplicate value arraylist 
		arr.add("Priyanshu");
		arr.add(10);
		arr.add(14.5f);
		System.out.println(arr);
		//arr.clear(); //to clear the array
		System.out.println(arr);
		System.out.println(arr.contains(10));
		System.out.println(arr.get(0));
		arr.remove(1);
		System.out.println(arr);
		arr.add("Priyanshu");
		System.out.println(arr);
		System.out.println(arr.size());
		// for particular types of data use genrics
		ArrayList <String>array=new ArrayList<String>();
		array.add("hola");
		System.out.println(array);
		Iterator itr=arr.iterator();
		{
		    while(itr.hasNext())
		    {
		        System.out.println(itr.next());
		    }
		}
	}

}
