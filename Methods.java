package week1.assaignment3;

public class Methods {
	public int boxvolume (int L, int B, int H) {
		int vol;
		vol=L*B*H;
		return vol;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods m=new Methods();
		int boxvolume=m.boxvolume(10,4,6);		
		System.out.println(boxvolume);

	}

}
