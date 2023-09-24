package Primenumber;

public class primenum3to100 {
	  public static void main(String[] args) {
	        System.out.println("Prime numbers between 3 and 100:");
	        for (int num = 3; num <= 100; num++) {
	        	boolean isPrime = true;

	            for (int i = 2; i <= num / 2; i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }

	            if (isPrime) {
	                System.out.println(num);
	            }
	        }
	    }
	}
