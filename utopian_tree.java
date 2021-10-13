/**
The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height increases by 1 meter.
A Utopian Tree sapling with a height of 1 meter is planted at the onset of spring. How tall will the tree be after  growth cycles?

For example, if the number of growth cycles is n=5, the calculations are as follows:

Period  Height
0          1
1          2
2          3
3          6
4          7
5          14

Function Description
Complete the utopianTree function in the editor below.
utopianTree has the following parameter(s):
int n: the number of growth cycles to simulate

Returns
int: the height of the tree after the given number of cycles
**/


//Difficulty - Easy
//Number of Test Cases - 10
//Solution


import java.util.Scanner;

public class utopian_tree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cases=s.nextInt();
        while(cases>0){
            int Growth_cycles=s.nextInt();
            if(Growth_cycles==0){
                System.out.println(1);
            }
            else{
                int g=predict(Growth_cycles);
                System.out.println(g);
            }
            cases--;
        }

    }
    public static int predict(int Gc){
        int height = 1;
        for (int i = 1; i <=Gc; i++) {
            if(i%2==0){
                height=height+1;
            }
            else{
                height=height*2;
            }
        }
        return height;
    }
}
