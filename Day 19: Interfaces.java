import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i =1; i<= n; i++){
            if(n%i == 0){
                count += i;
            }
        }
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(count);
    }
}
