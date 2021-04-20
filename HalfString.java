public class Main
{
	public static void main(String[] args) {
		String txt="wiproo";
		int len1=txt.length();
		StringBuilder tx = new StringBuilder();
		for(int i=0;i<len1;i++){
		    if(len1%2==0){
		        int x=len1/2;
		        System.out.println(txt.substring(0,x));
		        break;
		    }
		    else{
		      System.out.println("Null");  
		      break;
		    }
		}
	}
}
