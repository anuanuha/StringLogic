package stringlogic;
public class reversestringoddwords{
    public static void main(String[] args) {
       String sentence = "hi hello java how are you"; // Replace with the sentence you want to reverse
	 System.out.println(sentence);
	 String[] words = sentence.split(" ");
	 for (int i=0; i<=words.length-1; i++) 
	    {
	        	if(i%2==0)
	    {
    	System.out.print(words[i]+" ");
           }	        	     
	    }
	}
}
