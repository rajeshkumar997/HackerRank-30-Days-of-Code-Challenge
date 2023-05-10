import java.io.*;
import java.util.*;

class Difference {
    private int[] elements;
    public int maximumDifference;

    // constructor
    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < minElement) {
                minElement = elements[i];
            }
            if (elements[i] > maxElement) {
                maxElement = elements[i];
            }
        }
        maximumDifference = Math.abs(maxElement - minElement);
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] elements = new int[n];
        for (int i = 0; i < n; i++) {
            elements[i] = sc.nextInt();
        }
       
        Difference d = new Difference(elements);
        d.computeDifference();

        System.out.println(d.maximumDifference);
    }
}
