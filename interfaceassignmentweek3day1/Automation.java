package interfaceassignmentweek3day1;

public class Automation extends MultipleLangauge implements TestTool, Language {

	@Override
	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java Programming Language");
	}

	@Override
	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium tool");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby Programming Language");
	}

	
	public static void main (String[] args) {
		
		Automation tool = new Automation();
		tool.Selenium();
		tool.Java();
		tool.python();
		tool.ruby();
		
		
	}
	

}
