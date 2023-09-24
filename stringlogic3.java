package stringlogic;
public class reversestringfrompoint {
    public static void main(String[] args) {
        String sentence = "hi hello java how are you";// Replace with the sentence you want to reverse
        System.out.print(sentence+"\n");
        String[] words = sentence.split(" ");
        for (int i =0 ; i< words.length/2-1; i++) 
        {
        	System.out.print(words[i]+" ");
        }
        for (int i =words.length-1;i>=2; i--)
        {
            System.out.print(words[i]+" ");
        }

     
    }
}

