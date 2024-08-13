package Rec_22;

public class Toh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		
		toh(n,"A","B","C");

	}

	public static void toh(int n, String src, String hip, String des) {
		if(n==0) {
			return;
		}
		toh(n-1,src,des,hip);
		System.out.println("Move"+" "+ n+" "+ "from"+" "+src+" "+"to"+" "+des);
		toh(n-1,hip,src,des);
		
	}

}
