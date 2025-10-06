import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
       
        int n=s.length();
        int f[]=new int[n];
        char a[]=new char[n];
        int i=0;
        while(i<n){
            a[i]=s.charAt(i);
            f[i]=1;
            i++;
        }
        
        for( i=0;i<n;i++){
            if(f[i]==0){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(f[j]==0){
                    continue;
                }
                if(a[i]==a[j]){
                    f[i]++;
                    f[j]=0;
                }
            }
        }
        for(i=0;i<n;i++){
            if(f[i]==1){
                System.out.println(a[i]+"->"+f[i]);
                break;
            
            }
        }
        
}
}