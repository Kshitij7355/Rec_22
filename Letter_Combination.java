package Rec_22;
import java.util.*;
public class Letter_Combination {
static String[]code={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ll = new ArrayList<>();
		String ques="23";
		Printanswer(ques,"",ll);

	}
	private static void Printanswer(String ques, String ans,List<String> ll) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			//System.out.println(ans+" ");
			ll.add(ans);
			return;
		}
		char ch =ques.charAt(0);
		String press = code[ch-48];//abc
		for (int i = 0; i < press.length(); i++) {
			Printanswer(ques.substring(1),ans+press.charAt(i),ll);
		}
	}

}
