/**
You are given a phone book that consists of people's names and their phone number. 
After that you will be given some person's name as query. For each query, print the phone number of that person.
For each case, print "Not found" if the person has no entry in the phone book. 
Otherwise, print the person's name and phone number. See sample output for the exact format.
**/

//Difficulty - easy
//Test cases - 5
//Solution

import java.util.HashMap;
import java.util.Scanner;

public class find_contact {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, Integer> phone_book = new HashMap<String,Integer>();
        int num= s.nextInt();
        s.nextLine();
        for (int i = 0; i < num; i++) {
            String a=s.nextLine();
            int b=s.nextInt();
            phone_book.put(a,b);
            s.nextLine();
        }
        while (s.hasNext()){
            String f=s.nextLine();
            if(phone_book.containsKey(f)){
                System.out.println(f+"="+phone_book.get(f));
            }
            else{
                System.out.println("Not found");
            }
            
        }
    }
}


