package week1.test1;

public class Firefox {

	public double version(){
	return 100.2;
	}
	public String name() {
		return "firefox";
	}
	public boolean visible() {
		return true;
	}
	public int year() {
		return 1998;
	}
	public char logo() {
		return 'm';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Firefox f= new Firefox();
		double version=f.version(); 
		System.out.println(version);
		String name=new String("firefox");
		System.out.println(name);
		boolean visible=f.visible(); 
		System.out.println(visible);
		int year=f.year(); 
		System.out.println(year);
		char logo=f.logo(); 
		System.out.println(logo);

	}

}
