import java.util.Scanner;
class Main{
    static int roman(char a){
     switch(a){
               
            case 'I':
                return 1;
               
            case 'V':
                return 5;
              
                
            case 'X':
              return 10;
             
               
            case 'L':
                return 50;
               
               
            case 'C':
                 return 100;
              
            case 'D':
               return 500;
             
                
            case 'M':
               return 1000;
               
               
            default:
                System.out.println("Invalid input");
        }
        return 0;
    }
  public static void main(String[] args){
        int num=0;
        
         
        Scanner sc=new Scanner(System.in);
         String c = sc.nextLine();
         for(int i=0;i<c.length();i++){
             char a=c.charAt(i);
             if((c.equals("IV"))||(c.equals("IX"))||(c.equals("XL"))||(c.equals("XC")) || (c.equals("CD"))||(c.equals("CM")) ){
                 num=roman(a)-num;
                 }
            else{
             num=num+roman(a);
            }
           
       
         }
          System.out.println(num);
    
}
}
