/*Given the following table containing information about employees of an organization, develop
a small java application, which accepts employee id from the command prompt and displays
the following details as output:*/

import java.util.*;
public class prob1 {
	public static void main(String[] args) {
   	Scanner sc=new Scanner(System.in);
   	
   	//table 1
   	
   	int[] emp={1001,1002,1003,1004};
   	String[] name={"Ashish","Sushma","Rahul","Ranjan"};
   	String[] date={" 01/04/2009"," 01/04/2009"," 01/04/2009"," 01/04/2009"};
   	char[] desigcode={'e','c','k','r'};
   	String[] dept={"IT","CSE","ACCT","ENGG"};
   	int[] basic={20000,30000,10000,12000};
   	int[] hra={8000,12000,8000,6000};
   	int[] it={3000,9000,1000,2000};
	System.out.println("EmpNo."+" EmpName"+" JoinDate"+" DesigCode"+" Dept"+" Basic"+" HRA"+" IT");
	for(int i=0;i<name.length;i++){
		System.out.println(emp[i]+"  "+name[i]+"  "+date[i]+"  "+desigcode[i]+"  "+dept[i]+"  "+basic[i]+"  "+hra[i]+"  "+it[i]);
	}
	
   	//table 2
   	char[] desicode={'e','c','k','r'};
   	String[] desig={"Engineer","Consulatant","Clerk","Receptionist"};
   	int[] da={20000,32000,12000,15000};
	System.out.println("\nDesigCode"+" Designation"+" DA");
	for(int i=0;i<desicode.length;i++){
	System.out.println("   "+desicode[i]+"     "+desig[i]+" "+da[i]);
	}
	int index=0;
	System.out.println("Enter Emp No. to search : ");
	int search=sc.nextInt();
	for(int i=0;i<desig.length;i++){
		if(search==emp[i]){
			index=i;
		}
	}
	int salary=0;
	char x=desigcode[index];
   	switch(x){
   	case 'e':
   	{
   		salary=basic[index]+hra[index]+da[index]-it[index];
   	
   	}
   	case 'c':{
   		salary=basic[index]+hra[index]+da[index]-it[index];
   	}
   	case 'k':{
   		salary=basic[index]+hra[index]+da[index]-it[index];
   	}
   	case 'r':{
   		salary=basic[index]+hra[index]+da[index]-it[index];
   	}
   }
   	System.out.println("EmpNo. "+ "EmpName"+" Department "+"Designation "+"Salary");
   	System.out.println(emp[index]+"   "+name[index]+"     "+dept[index]+"     "+desig[index]+" "+salary);
}
}


