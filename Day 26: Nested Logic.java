import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in= new Scanner(System.in);
        int[] arr= new int[6];
        for(int i=0; i<6;i++)
        {
            arr[i]= in.nextInt();
        }
        int fine=0;
        int actualrday=arr[0];
        int actualrmonth=arr[1];
        int actualryear=arr[2];
        int expectedrday=arr[3];
        int expectedrmonth=arr[4];
        int expectedyear=arr[5];

        if(actualryear==expectedyear)
        {
            if(actualrmonth<=expectedrmonth){
                if(actualrday<=expectedrday)
                {
                    fine=0;
                }
                else{fine=(actualrday-expectedrday)*15;}
            }
            else{fine=(actualrmonth-expectedrmonth)*500;}    
        }
        else if(actualryear<expectedyear)
        {
            fine=0;
        }
        else if(actualryear>expectedyear){fine=10000;}
        System.out.println(fine);
    }
}
