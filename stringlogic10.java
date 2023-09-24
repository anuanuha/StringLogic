package stringlogic;

public class replacecharacter {
  public static void main(String[] args) {
	String str="i am anu h A";
	System.out.println(str.replace('h','H'));
    String s1="mava1 athey2 rama3 pavan4";
    System.out.println(s1.replaceAll("[1-4]","9"));
    String s2="mava1 athey2 rama3 pavan4";
    s2=s2.replaceAll("a","6");
    System.out.println(s2.replaceAll("[1-4]","7"));
    
}

}