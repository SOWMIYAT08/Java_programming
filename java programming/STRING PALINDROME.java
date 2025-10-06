import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	    String rev="";
		for(int i=s.length()-1;i>=0;i--){
		  rev=rev+s.charAt(i);
		}
		int c=0;
      for(int i=0;i<s.length();i++){
          if(s.charAt(i)==rev.charAt(i)){
              c++;
          }
      }
      if(c==s.length()){
          System.out.println("yes");
      }
      else{
          System.out.println("no");
      }
	}
}