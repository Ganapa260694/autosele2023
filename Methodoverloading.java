package week2.day3;

public class Methodoverloading {
	
	public int add (int a, int b) {
	return a+b;
	}
	public double add (double a, double b, double c) {
	return a+b+c;
	}
	public float add (float a, float b) {
		return a+b;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methodoverloading M=new Methodoverloading();
		System.out.println("addition of two numbers:" +M.add(10,20));
		System.out.println("addition of three numbers:" +M.add(10.5,20.6,15.2));
		System.out.println("addition of float numbers:" +M.add(10.5f,20.6f));
	}

}
