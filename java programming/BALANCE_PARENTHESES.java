
import java.util.*;
class Main{
    static boolean isBalance(String s){
        while(s.contains("()")||s.contains("{}")||s.contains("[]")){
            s=s.replace("()","").replace("{}","").replace("[]","");
        }
        return s.isEmpty();
    }
    public static void main(String[] args){
        String s="({[}])";
        System.out.println((isBalance(s)));
    }
}