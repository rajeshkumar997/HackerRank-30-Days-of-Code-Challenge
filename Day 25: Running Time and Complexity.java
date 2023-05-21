import java.io.*;
import java.util.*;

public class Solution {
     public static boolean isPrime(int num){
        if (num == 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0) return false;
        } return true;
    }
    
    public static void main(String[] args) {
          /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int num = sc.nextInt();
            if (isPrime(num)) System.out.println("Prime");
            else System.out.println("Not prime"); 
        }
    }
}
