import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

int positiveCount = 0, negetiveCount = 0,zeroCount = 0,len=arr.length;
        for(int i=0; i < len; i++){
            
            if(arr[i]<0){
                negetiveCount++;
            }else if(arr[i]>0){
                positiveCount++;
            }else if(arr[i]==0){
                zeroCount++;
            }
        }
        float a=0f,b=0f,c=0f;
        a = (float)positiveCount/len;
        b = (float)negetiveCount/len;
        c = (float)zeroCount/len;
        System.out.printf("%.6f \n",a);
        System.out.printf("%.6f \n",b);
        System.out.printf("%.6f",c);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
