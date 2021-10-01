/** 
Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description
-Complete the isAnagram function in the editor.
-isAnagram has the following parameters:

1) string a: the first string
2) string b: the second string
**/

//Difficulty - Easy
//Number of Test Cases - 17
//Solution


// Author @vivekshukla24 + https://www.linkedin.com/in/versesshukla/


import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        String g=a.toLowerCase();
        String h=b.toLowerCase();
        char[] ch1 = g.toCharArray();
        char[] ch2 = h.toCharArray();
        if(ch1.length != ch2.length){
            return false;
        }
        java.util.Arrays.sort(ch1);
        java.util.Arrays.sort(ch2);
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i]!=ch2[i]){
                    return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
