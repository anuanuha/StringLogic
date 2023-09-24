package stringlogic;
public class reversesentance4 {
    public static void main(String[] args) {
        String sentence = "hi hello java how are you"; // how are you java hello hi
        System.out.println(sentence);
        String[] words = sentence.split(" ");
        for (int i =words.length/2; i<=words.length-1 ; i++) 
        {
        	System.out.print(words[i]+" ");
        }
        for (int i =words.length/2-1;i>=0; i--)
        {
            System.out.print(words[i]+" ");
        }

     
    }
}
