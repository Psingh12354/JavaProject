/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Map mp=new HashMap();
		Map mp1=new LinkedHashMap(); //insertion order maintain
		Map mp2=new TreeMap();
		Map mp3=new Hashtable(); //order not maintain
		//instead of add use put method
		mp.put(1,"Priyanshu");
		mp.put(2, "Rahul");
		mp.put(2,"Singh"); //key not repeated if repeated than over right
		mp.put(5,"Five");
		mp.put(4,"s");
		System.out.println(mp);
		mp1.put(1,"Priyanshu");
		mp1.put(2, "Rahul");
		mp1.put(2,"Singh");
		mp1.put(5,"Five");
		mp1.put(4,"s");
		System.out.println(mp1);
		mp2.put(1,"Priyanshu");
		mp2.put(2, "Rahul");
		mp2.put(2,"Singh");
		mp2.put(5,"Five");
		mp2.put(4,"s");
		System.out.println(mp2);
		mp3.put(1,"Priyanshu");
		mp3.put(2, "Rahul");
		mp3.put(2,"Singh");
		mp3.put(5,"Five");
		mp3.put(4,"s");
		System.out.println(mp3);
		System.out.println(mp3.entrySet()); //sqare bracket
	   // Set s=mp3.entrySet();
	   // Iterator itr=s.iterator();
	   // while(itr.hasNext()){
	   //     System.out.println(itr.next());
	   // }
	    Set s=mp3.entrySet();
	    Iterator itr=s.iterator();
	    while(itr.hasNext()){
	        Map.Entry en= (Map.Entry)itr.next();
	        System.out.println(en.getKey());
	        System.out.println(en.getValue());
	    }
    //   Set<Map.Entry<String,Integer>> s = mp3.entrySet();
    //     for (Map.Entry<String, Integer> it: s){
    //         System.out.println(it.getKey() + "   " + it.getValue());
    //     }
	   
	}
}
