import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int count=0,swap1,temp;
        int i=0;
        while(i>0){
        for(int j=n-1,i=0;i>j;i++,j--){
            if(a[i]==0 ||a[j]==1 ){
               swap1=a[i];
               temp=a[j];
               a[j]=swap1;
               swap1=temp;
               count++;
            } 
            
        }
        i++;
        }
        System.out.println(count);
    }
}