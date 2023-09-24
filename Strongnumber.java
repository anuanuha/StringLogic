package Primenumber;

public class strong_number {
	public static void main(String[] args) {
		int num=145;
		numsum(num);
	
	}
static void numsum(int num)
{
	int copy=num;
	int sum=0;
	while (num!=0)
	{
		int rem=num%10;
		sum=sum+factorial(rem);
		num=num/10;
	}
	if(copy==sum)
	{
		System.out.println("strong number");
			
	}
	else
	{
		System.out.println(" not strong number");
	}
}
        static int factorial(int num)
        {
        	int fact=1;
        	for(int i=num;i>=1;i--)
        	{
        		fact=fact*i;
        		
        	}
        	return fact;
        }
}

