import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int n1=s1.length();
        int n2=s2.length();
        int c=0;
        if(n1!=n2) System.out.println("not anagram");
        char []arr1=s1.toCharArray();
        char []arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }
           
    }
}