package week1.assaignment2;

public class Car {
	public void drivercar() {
		System.out.println("drivercar is: ram");
	}
		public void applybreak() {
			System.out.println("applybreak at: 10km");
		}
		public void soundhorn() {
			System.out.println("soundhorn: now");
		}
		public void ispuncture() {
			System.out.println("ispuncture : no");
		}
		public int carno() {
			return 123456;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car C = new Car();
		C.drivercar();
		C.applybreak();
		C.soundhorn();
		C.ispuncture();
		int carno = C.carno();
		System.out.println(carno);
		
		

	}

}
