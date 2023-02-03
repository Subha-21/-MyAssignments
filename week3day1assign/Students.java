package week3day1assign;

public class Students {
	
	public void getStudentInfo(int id) {
		
		System.out.println("Student id is :" +id);
	}
	
    public void getStudentInfo(int id, String name) {
		
		System.out.println("Student id and name is :" +id + " , " +name);
	}
	
    

    public void getStudentInfo(String email, int phn) {
		
		System.out.println("Student email and phone is :" +email + " , " +phn);
	}

    
    
    public static void main(String[] args) {
    	
    	Students info = new Students();
    	info.getStudentInfo(5156);
    	info.getStudentInfo(5156, "Suganya");
    	info.getStudentInfo("sugan@gmail.com", 44);
    	
    }
    
}
