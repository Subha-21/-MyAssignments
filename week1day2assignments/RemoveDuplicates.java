package week1day2assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strName = "We learn java basics as part of java sessions in java week1";	
		String[] strArrayName = new String[strName.length()];
		
		
		int count;
		
		String[] split = strName.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			count =1;
			
			for (int j = i+1; j < split.length; j++) {
				
			if(strArrayName[i].equals(strArrayName[j])) {
				count++;
			}
				if(count>1) {
					System.out.println(" ");
				}
			}
			
		}
		
		
	}

}
