public class Main
{
	public static void main(String[] args) {
		String txt="wipro";
		int len1=txt.length();
		StringBuilder tx = new StringBuilder();
		for(int i=0;i<len1;i++){
		    if(len1>2){
		        System.out.println(txt.substring(1,len1-1));
		    }
		    else{
		        System.out.println("Less than 2 char");
		    }
		}
	}
}
