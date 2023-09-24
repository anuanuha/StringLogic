package stringlogic;

public class reversestring {
	public static void main(String[] args) {
// to fetch the character we use the method charAt (charAt method is used to fetch the method based the index value )
	String str="JAVA";
	String reverse="";
	for(int i=str.length()-1;i>=0;i--)
	{
     reverse=reverse+str.charAt(i);
    }
 System.out.println(reverse);
}
}