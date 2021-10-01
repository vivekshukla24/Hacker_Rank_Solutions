/**
You are in charge of the cake for a child's birthday.
You have decided the cake will have one candle for each year of their total age. 
They will only be able to blow out the tallest of the candles. Count how many candles are tallest. 
**/

// Author @vivekshukla24 + https://www.linkedin.com/in/versesshukla/


//Difficulty - Easy
//Number of Test Cases - 8
//Solution

import java.util.Scanner;

public class birthday {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int max=0;
        int countcandle=0;
        int candle;
        candle=s.nextInt();
        int [] height= new int[candle];
        for(int i=0;i<candle;i++){
            height[i]=s.nextInt();
        }
        for(int i=0;i<candle;i++){
            if(height[i]>max){
                max=height[i];
            }
            else{
                max=max;
            }
        }
        for(int i=0;i<candle;i++){
            if(height[i]==max)
            countcandle++;
        }
        System.out.println(countcandle);
    }
}
