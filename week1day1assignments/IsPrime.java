package week1day1assignments;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 4;
		boolean bPrime = true;
		
		
		for (int i = 2; i < 12 ; i++) {
			
			if(num%i == 0) {
				System.out.println(" It is not a prime number ");
				bPrime = false;
				break;
		}
			if(bPrime == true) {
				System.out.println("It is a Prime Number");
				break;
			}
		}
	}

}
