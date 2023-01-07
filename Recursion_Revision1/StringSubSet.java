package Recursion_Revision1;
import java.util.*;
public class StringSubSet {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String str = sc.next();
		 
		 SubSet(str,"");
		 

	}

	private static void SubSet(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans+" ");
			return;
		}
		
		for(int i = 0; i<ques.length(); i++) {
			String s1 = ques.substring(0,i);
			String s2 = ques.substring(i+1);
			SubSet(s1+s2, ans+ques.charAt(i));
			
		}
		
		
		
	}
	
	

}
