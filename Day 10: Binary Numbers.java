import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String binaryString = Integer.toBinaryString(n);
        int count = 0;
        int maxConsecutiveOnes = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                count++;
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, count);
            } else {
                count = 0;
            }
        }
        System.out.println(maxConsecutiveOnes);
        bufferedReader.close();
    }
}
