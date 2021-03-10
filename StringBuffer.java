public class Main
{
	public static void main(String[] args) {
        String str=new String("India is country. ");
        String str1="Hi i am in house";
        //String is immutable here you need to assign explicityl
	    str=str.concat("I am in Agra"); 
	    System.out.println(str);
	    // to check work present or not
	    System.out.println(str1.contains("Hi"));
	    //String buffer class is mutable
	    StringBuffer sb=new StringBuffer("Delhi is capital of India");
	    sb.append(" and also Delhi is a methropolitan city");
	    System.out.println(sb);
	    str=str.toUpperCase();
	    System.out.println(str);
	}
}
