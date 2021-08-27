/**Two friends Anna and Brian, are deciding how to split the bill at a dinner. Each will only pay for the items they consume. 
Brian gets the check and calculates Anna's portion. You must determine if his calculation is correct.

Complete the bonAppetit function in the editor below. It should print Bon Appetit if the bill is fairly split. 
Otherwise, it should print the integer amount of money that Brian owes Anna.

bonAppetit has the following parameter(s):

1) bill: an array of integers representing the cost of each item ordered
2) k: an integer representing the zero-based index of the item Anna doesn't eat
3) b: the amount of money that Anna contributed to the bill

**/

//Difficulty - Easy
//Test cases - 6
//Solution

import java.util.Scanner;

public class Bill_division {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int k= s.nextInt();
        int[] bill= new int[n];
        for (int i = 0; i < bill.length; i++) {
            bill[i]=s.nextInt();
        }
        int b_charged=s.nextInt();
        int b_actual_before_division=0;
        for (int i = 0; i < bill.length; i++) {
            if(i!=k){
                b_actual_before_division=b_actual_before_division+bill[i];
            }
        }
        int b_actual=b_actual_before_division/2;
        if(b_actual==b_charged){
            System.out.println("Bon Appetit");
        }
        else {
            System.out.println(b_charged-b_actual);
        }
    }
}
