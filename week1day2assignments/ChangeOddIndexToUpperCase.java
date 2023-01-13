package week1day2assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "changeme";
		
		char[] testUpper  =  new char[test.length()] ;
		
		char[] nameArray = test.toCharArray();
		
		for (int i = 0; i < nameArray.length; i++) {
			
			if(i%2 != 0) {
				
				testUpper[i] = Character.toUpperCase(nameArray[i]);
				
			} else {
				testUpper[i] = nameArray[i];
			}
			
			}	
		System.out.print(testUpper);
						
			}
			}
		
	
