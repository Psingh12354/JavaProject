public class Main
{
	public static void main(String[] args) {
		String txt="wipro";
		int len1=txt.length();
		StringBuilder tx = new StringBuilder();
		for(int i=0;i<len1;i++){
		    for(int j=0;j<2;j++){
		        Character c1 = txt.charAt(j);
		        tx.append(c1);
		    }
		}
        System.out.println(tx);
	}
}
