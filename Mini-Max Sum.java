import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        
          /*for (int j = 0; j < arr.length - 1; j++) { 
  
            
            if (arr[j] > arr[j + 1]) { 
  
                int temp = arr[j]; 
                arr[j] = arr[j + 1]; 
                arr[j + 1] = temp; 
  
                
                j = -1; 
            } 
        } */
        Arrays.sort(arr);
  
       
        long minsum=0;
        for(int i=0;i<arr.length-1;i++)
        minsum = minsum+arr[i];
    
        
        long maxsum=0;
         for(int i=1;i<arr.length;i++)
        maxsum = maxsum+arr[i];
    
        
        System.out.println(minsum +" "+maxsum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
