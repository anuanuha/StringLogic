package stringlogic;

import java.util.Scanner;

public class conut_words_in_string {
	    public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("enter the sentance");
	      String sentence=sc.nextLine();
	       int count=countstring(sentence);
	       System.out.println(count);
}
	    static int countstring( String sentence)
	    {
	    	String[] s1=sentence.split(" ");
	    	String k="java";
	    	int count=0;
	    	for(int i=0;i<=s1.length-1;i++)
	    	{
	    		if(s1[i].equals(k))
	    		{
	    			count++;
	    		}
	    	}
	    	//System.out.println(k+"-->"+count);
	    	return count;
	    }
}
