
public class Main
{
	public static void main(String[] args) {
		String txt="Hello";
		int len=txt.length();
		char ch=0;
		StringBuilder tx = new StringBuilder();
        for(int i=0;i<len;i++)
        {
            Character c = txt.charAt(i);
            if(Character.isUpperCase(c)){
                ch=c.toLowerCase(c);
                System.out.println(ch);
            }
            else{
                ch=c.toUpperCase(c);
                System.out.println(ch);
            }
            tx.append(Character.toString(ch));
        }
        System.out.println(tx);
	}
}
