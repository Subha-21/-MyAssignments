package week1day1assignments;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNum =0;
		int secNum =1;
		int sum = 0;
		int count =11;
		
		System.out.println(firstNum + " " + secNum);
		
		
		for (int i = 0; i < count; i++) {
			sum = firstNum + secNum;
			System.out.println(" " + sum);
			firstNum = secNum;
			secNum = sum;
		}
		
	}

}
