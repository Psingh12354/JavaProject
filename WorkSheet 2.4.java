import java.util.*;
import java.io.*;
import java.io.FileWriter;
public class Ws2_4
{
	public static void main(String[] args) {
		while(true){
			System.out.println("Select the option:");

			System.out.println("1. Add Employee");
			System.out.println("2. Display");
			System.out.println("3. Exit");
			Scanner sc = new Scanner(System.in);

			int choice = sc.nextInt();
			switch (choice) {
				case 1:
					try {
						System.out.println("Enter Employee ID:");
						int id=sc.nextInt();
						System.out.println("Enter Employee Name:");
						String name=sc.next();
						System.out.println("Enter Employee Age:");
						int age=sc.nextInt();
						System.out.println("Enter Employee Salary:");
						int sal=sc.nextInt();
						Employee e1=new Employee(id,name,age,sal);
						FileOutputStream file = new FileOutputStream("D:\\test\\employee.txt");
						ObjectOutputStream out = new ObjectOutputStream(file);
						out.writeObject(e1);
						out.close();
						file.close();
					}
					catch(FileNotFoundException e){
						System.out.println("File not found");
					}
					catch(IOException e)
					{
						System.out.println("IOException is caught");

					};
					break;
				case 2:
					//obj.Display();
					try
					{
						FileInputStream file = new FileInputStream("D:\\test\\employee.txt");
						ObjectInputStream in = new ObjectInputStream(file);
						Employee e = (Employee)in.readObject();

						in.close();
						file.close();
						System.out.println("----Report----");
						System.out.println(e.id+" "+ e.name+" "+e.age+" "+e.salary+"\n");
						System.out.println("----End of Report-----");
					}
					catch(IOException ex)

					{

						System.out.println(ex);

					}
					catch(ClassNotFoundException ex)

					{

						System.out.println("ClassNotFoundException is caught");

					}

					break;
				case 3:
					System.exit(0);
					break;
			}
		}
	}
}
class Employee implements Serializable
{
	int id;
	String name;
	int age;
	int salary;
	Employee(int id ,String name,int age,int salary)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
	}

}
