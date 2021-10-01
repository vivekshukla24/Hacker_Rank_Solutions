/**
We define the following terms:

Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string,s, and an integer,k,complete the function so that it finds the lexicographically smallest and largest substrings of length k.

Function Description

Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

string s: a string
int k: the length of the substrings to find
Returns

string: the string ' + "\n" + ' where and are the two substrings
**/

//Difficulty - Easy
//Number of Test Cases - 7
//Solution

import java.util.Scanner;
public class comparison {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String demo= s.next();
        int x=s.nextInt();
        String small=demo.substring(0,x);
        String large="";
        for (int i = 0; i <=demo.length()-x; i++) {
            String temp=demo.substring(i,i+x);
            if(temp.compareTo(small)<0){
                small=temp;
            }
            if(temp.compareTo(large)>0){
                large=temp;
            }
        }
        System.out.println(small);
        System.out.println(large);
    }
}
