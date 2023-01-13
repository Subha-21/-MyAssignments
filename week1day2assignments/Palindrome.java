package week1day2assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strName = "madam";
		String rev = "";
		
		char[] charName = strName.toCharArray();
		
		for (int i = charName.length-1 ; i >= 0 ; i--) {
			
			rev = rev + charName[i];
			
			if(charName.equals(rev)) {
				System.out.println("It is palindrome");
			}
			else {
				System.out.println(" It is not a palindrome");
			}
		}
		
	}

}
