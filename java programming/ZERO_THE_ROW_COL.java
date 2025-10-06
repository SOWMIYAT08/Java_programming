import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				a[i][j]=sc.nextInt();
			}
		}
	   int[] row=new int[r];
	   int[] col=new int[c];
	   
	   for(int i=0;i<r;i++){
	       for(int j=0;j<c;j++){
	           if(a[i][j]==0){
	               row[i]=1;
	               col[j]=1;
	               
	               }
	       }
	   }
	  for(int i=0;i<r;i++){
	      for(int j=0;j<c;j++){
	          if(1==row[i]||1==col[j]){
	              a[i][j]=0;
	          }
	      }
	      
	  }
	 
     
	
	for(int i=0;i<r;i++){
	    for(int j=0;j<c;j++){
	        System.out.print(a[i][j]+" ");
	    }
	    System.out.println();
	}
}
}
