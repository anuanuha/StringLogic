package stringlogic;

public class check_palindrome {
	public static void main(String[] args) {
		// to fetch the character we use the method charAt (charAt method is used to fetch the method based the index value )
			String str="java";
			String reverse="";
			for(int i=str.length()-1;i>=0;i--)
			{
		     reverse=reverse+str.charAt(i);
			}
		     if(str.equals(reverse)) {
		    	 System.out.println("palindrome");
		     }
		     else {
		    	 System.out.println("not palindrome");
		     }
		}

}
