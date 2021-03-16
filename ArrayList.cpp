/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*; 
import java.util.*; 
public class Main
{
    private ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<Integer> saveEvenNumbers(int n){
        list = new ArrayList<Integer>();
        int i=2;
        while(i<=n){
            if(i%2==0){
                list.add(i);
            }
            i++;
        }
        return list;
    }
    public ArrayList<Integer> printEvenNumbers(){
        ArrayList<Integer> newlist= new ArrayList<Integer>(); 
        for(int x: list){
            newlist.add(x*2);
            System.out.println(x*2);
        }
        return newlist;
    }
	public static void main(String[] args) {
		Main obj=new Main();
		obj.saveEvenNumbers(10);
		obj.printEvenNumbers();
	}
}
