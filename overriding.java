public class Main
{
	public static void main(String[] args) {
	    B obj=new B();
	    obj.display();
	}
}
class A{
    void display(){
        System.out.println("A");
    }
}
class B extends A{
    void display(){
        System.out.println("B");
    }
}
