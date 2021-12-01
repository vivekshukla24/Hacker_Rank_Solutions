package CU;
//Hackerrank - Divisible Sum Pairs
// Given an array ar[] of integers and a positive integer k,
// determine the number of (i,j) pairs where i<j and ar[i]+ar[j] is divisible by k.

import java.util.Scanner;
class DivisibleSumPairs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int[] ar= new int[n];
        for (int i = 0; i < n; i++) {
            ar[i]= s.nextInt();
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                if ((ar[i]+ar[j])%k==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}