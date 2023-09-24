
package stringlogic;
public class reversesentencewithreversestring{
	    public static void main(String[] args) {
	    
	        String sentence = "hi hello java how are you"; // ih avaj era
	        System.out.println(sentence);
	        String[] words = sentence.split(" ");
	        for (int i=0;i<=words.length-1;i++)
	        {
	        	if(i%2==0)
	        	{
	        		String str2=words[i];//hi
	        		String reverse="";
	        	   for (int j=str2.length()-1;j>=0;j--)
	        	   {
	        		   reverse=reverse+str2.charAt(j);
	        	   }

	        	System.out.print(reverse+" ");
	    }
	    }
	    }
}

