package Rec_22;

import java.util.ArrayList;
import java.util.List;

public class Print_Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=1000;
		Count(0,n);

	}

	

	public static void Count(int curr, int n) {
		if(curr>n) {
			return;
		}
		System.out.println(curr);
		int i=0;
		if(curr==0) {
			i=1;
		}
		for(;i<=9;i++) {
			Count(curr*10+i,n);
		}
		
	}

}
