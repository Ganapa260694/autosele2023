package week1.day1;

public class Iphone {

	public void makecall() {
		System.out.println("makecall: now");
	}
	public void model() {
		System.out.println("model: 13x pro");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Iphone I= new Iphone();
I.makecall();
I.model();
Smartphone S=new Smartphone();
S.makecall();
S.model();
	
	}

}
