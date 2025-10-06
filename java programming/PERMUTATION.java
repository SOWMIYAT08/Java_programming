import java.util.*;

public class Main {
    // function to generate permutations
    static void permute(char[] a, int l, int r) {
        if (l == r) {
            System.out.println(a);
        } else {
            for (int i = l; i <= r; i++) {
                // swap
                char temp = a[l];
                a[l] = a[i];
                a[i] = temp;

                // recurse for next index
                permute(a, l + 1, r);

                // backtrack (undo swap)
                temp = a[l];
                a[l] = a[i];
                a[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] a = s.toCharArray();
        permute(a, 0, a.length - 1);
    }
}
