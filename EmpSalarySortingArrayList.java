import java.io.Serializable;
import java.util.*;
public class Employee{
    public static void main(String[] args){
		ArrayList<Emp> list=new ArrayList<Emp>();
		list.add(new Emp("Priyanshu",20,10000000));
		list.add(new Emp("Singh",30,500000));
		list.add(new Emp("Ashu",1000,20000000));
	    list.sort(Comparator.comparing(Emp::getSalary));
		for(Emp i: list){
			System.out.println(i.getName()+" "+i.getAge()+" "+i.getSalary());
		}
    }
}
class Emp{
	String name;
	int age;
	int salary;
	Emp(String name,int age,int salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int  getSalary() {
		return salary;
	}
}
