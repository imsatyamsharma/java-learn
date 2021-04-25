import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		int n,rem=0,reverse=0,i;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter any number");
		n=s1.nextInt();
		i=n;
		for(;n!=0;)
		{
			rem=n%10;
		    reverse=reverse*10+rem;
		    n=n/10;
		}
		if(i==reverse){
		    		System.out.println("given number is Palindrome");
		    	}    
		    	else{
	    	System.out.println("number is not palindrome");
	    }
	    
	}		
}