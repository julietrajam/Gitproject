package week2.day2;

public class SumOfDigits {
	
	public static void main(String[] args) {
		
		int n=123; //24
		
		int sum=0,rem;
		
		while(n>0)
		{
			rem=n%10; //rem=4
			sum=sum+rem; //4
			n=n/10;  //   
		}
		
		System.out.println("Sum of digits:" +sum);
	}

}
