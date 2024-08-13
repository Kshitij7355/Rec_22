package Rec_22;

public class Find_possible_path_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;//row
		int m=5;//coloum
		String ans = "";
		System.out.println("\n"+PrintPath(0,0,n-1,m-1,ans));

	}
	//cc--> current col cr-->current row ec-->end coloum er-->end coloum
	public static int PrintPath(int cr, int cc, int er, int ec,String ans) {
		if(cr==er && cc==ec) {
			System.out.println(ans);
			return 1;
		}
		int b=0;
		int a = 0;
		if(cr<=er) {
			 a=PrintPath(cr+1,cc,er,ec,ans+'V');
		}
		if(cc<=ec) {
			 b=PrintPath(cr,cc+1,er,ec,ans+'H');
		}
		
		return a+b;
		
	}

}
