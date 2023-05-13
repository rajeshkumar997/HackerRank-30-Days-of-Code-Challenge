import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int p = sc.nextInt();
            
            if(n <0 || p<0){
                System.out.println("n and p should be non-negative");
            }
            else{
                System.out.println((int)Math.pow(n,p));
            }
        }
    }
}
