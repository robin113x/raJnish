//package MathPro;

import java.util.Arrays;
import java.util.Scanner;
public class Q1_countDigit {
    public  void countDigit(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int count=1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i]+" = "+count);
        }
    }
    public static void countdigit(int[]arr){
        Arrays.sort(arr);
        int count=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }else {
                    System.out.println(arr[i]+" = "+count);
                    i=j;
                    count=1;
                }
            }
        }
        System.out.println(arr[arr.length-1]+" = "+count);
    }
    public static void countDigi(int[]arr){
        Arrays.sort(arr);
        int count=1;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1]){
                count++;
            }else {
                System.out.println(arr[i]+" = "+count);
                count=1;
            }
        }
        System.out.println(arr[arr.length-1]+" = "+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        int[]arr = { 1,2,2,2,3,4,5,6,6,5,5,5};
       // Q1_countDigit obj = new Q1_countDigit();
        //obj.countDigit(arr);
        countdigit(arr);
        System.out.println("******************");
        countDigi(arr);
    }
}
