package stringlogic;
public class reversesentence5{
	    public static void main(String[] args) {
	        String sentence = "hi hello java how are you"; // you are how hi hello java
	        System.out.println(sentence);
	        String[] words = sentence.split(" ");
	        for (int i =words.length-1; i>=words.length/2; i--) 
	        {
	        	System.out.print(words[i]+" ");
	        }
	        for (int i =0;i<=words.length/2-1; i++)
	        {
	            System.out.print(words[i]+" ");
	        }

	     
	    }
	}

