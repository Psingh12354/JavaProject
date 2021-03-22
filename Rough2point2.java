/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	HashSet hs11=new HashSet();
	hs11.add("AA");
	hs11.add("BB");
	hs11.add(1);
	HashSet hs22=new HashSet();
	hs22.add("AA");
	hs22.add(1);
	hs22.add(2);
// 	hs11.retainAll(hs22); //to print the common element
    hs22.addAll(hs11); //add without repeatation kind of cartessian product
	System.out.println(hs11);
	System.out.println(hs22);
	Set st=new HashSet();
	ArrayList arr=new ArrayList();
	arr.add(1);
	arr.add(1);
	arr.add(2);
	arr.add(2);
	st.addAll(arr);
	System.out.println(st);
	Person p1=new Person(10,"Priyansu");
	Person p2=new Person(20,"Singh");
	ArrayList<Person> arr1=new ArrayList<Person>();
	arr1.add(p1);
	arr1.add(p2);
	System.out.println(arr1);
	Iterator itr=arr1.iterator();
	while(itr.hasNext())
	{
	    Person p8=(Person) itr.next();
	    System.out.println(p8.age);
	    System.out.println(p8.name);
	}
	}
}
class Person{
    int age;
    String name;
    Person(int age,String name)
    {
        this .age=age;
        this .name=name;
    }
}
