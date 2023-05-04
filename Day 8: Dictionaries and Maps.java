import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of entries in the phone book
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        
        // Read in the phone book entries
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int phone = sc.nextInt();
            phoneBook.put(name, phone);
        }
        
        // Read in the queries and look up each name in the phone book
        while (sc.hasNext()) {
            String name = sc.next();
            if (phoneBook.containsKey(name)) {
                int phone = phoneBook.get(name);
                System.out.println(name + "=" + phone);
            } else {
                System.out.println("Not found");
            }
        }
    }
}
