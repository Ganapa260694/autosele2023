package week2.day1;

public class Assaigment1 {

	public static void main(String[] args) {
		int income=500000;
		if (income<0) {
		System.out.println(income*0.00);	
		}
		else if(income<8925) {
			System.out.println(income*0.10);	
		}
		else if(income<36250) {
			System.out.println(income*0.15);	
		}
		else if(income<87850) {
			System.out.println(income*0.23);	
		}
		else if(income<183250) {
			System.out.println(income*0.28);	
		}
		else if(income<398350) {
			System.out.println(income*0.33);	
		}
		else if(income<400000) {
			System.out.println(income*0.35);	
		}
		else {
			System.out.println(income*0.396);
		}
		
	}
}
		
	
	


