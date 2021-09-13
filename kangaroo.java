/**You are choreographing a circus show with various animals. For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).

The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump.
The second kangaroo starts at location v1 and moves at a rate of v2 meters per jump.
You have to figure out a way to get both kangaroos at the same location at the same time as part of the show. If it is possible, return YES, otherwise return NO.

**/

//Difficulty - Easy
//Test cases - 30
//Solution

import java.util.Scanner;

public class kangaroo {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x1=s.nextInt();
        int v1= s.nextInt();
        int x2=s.nextInt();
        int v2= s.nextInt();
        int u=x1;
        int v=x2;
        for (int i = 1; i <=10000 ; i++) {
            if (u==v){
                System.out.println("YES");
                break;
            }
            else if(i>9999){
                System.out.println("NO");
            }
            else{
                u=u+v1;
                v=v+v2;
            }

        }
    }
}
