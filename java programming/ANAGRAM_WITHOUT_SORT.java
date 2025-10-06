import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 String s1=sc.nextLine();
	 String s2=sc.nextLine();
	 int len1=s1.length();
	 int len2=s2.length();
	 if(len1!=len2){
	     System.out.println("false");
	     return;
	 }
	 int count[]=new int[26];
	 
	     for(int i=0;i<len1;i++){
	         count[s1.charAt(i)-'a']++;
	         count[s2.charAt(i)-'a']--;
	     }
	 
	 for(int i=0;i<len1;i++){
	     if(count[i]!=0){
	         System.out.println("false");
	         return;
	     }
	 }
	 System.out.print("true");
	}
}
