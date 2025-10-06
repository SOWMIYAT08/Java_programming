import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int pos=0;
       for(int i=0;i<n;i++){
           if(a[i]!=0){
             a[pos]=a[i];
             pos++;
           }
           
       }
       for(int i=pos;i<n;i++){
           a[pos]=0;
           pos++;
       }
       for(int i=0;i<n;i++){
           System.out.print(a[i]+" ");
       }
       
       
        
    }
}