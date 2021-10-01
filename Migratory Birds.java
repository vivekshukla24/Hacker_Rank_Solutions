/** Given an array of bird sightings where every element represents a bird type id, determine the id of the most frequently sighted type.
If more than 1 type has been spotted that maximum amount, return the smallest of their ids.
        Example arr=[1,1,2,2,3]
        There are two each of 1 types 2 and, and one sighting of type 3. Pick the lower of the two types seen twice: type 1.

        Function Description
        Complete the migratoryBirds function in the editor below.
        migratoryBirds has the following parameter(s):

        int arr[n]: the types of birds sighted

        Returns
        int: the lowest type id of the most frequently sighted birds **/

// Author @vivekshukla24 + https://www.linkedin.com/in/versesshukla/


//Difficulty - Easy
//Number of Test Cases - 6
//Solution

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Migratory_birds {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int number_of_birds=s.nextInt();
        int[] birds_id= new int[number_of_birds];
        for (int i = 0; i < birds_id.length; i++) {
            birds_id[i]=s.nextInt();
        }
        most_seen_bird(birds_id);
    }
     static void most_seen_bird(int[] array){
        HashMap<Integer,Integer> birds=new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (birds.containsKey(array[i])){
                birds.put(array[i], birds.get(array[i])+1);
            }
            else{
                birds.put(array[i],1);
            }
        }
        TreeMap<Integer,Integer> sorted_birds=new TreeMap<>();
        sorted_birds.putAll(birds);
        int max=Integer.MIN_VALUE;
        for (Map.Entry<Integer,Integer> answer:sorted_birds.entrySet()) {
            if(answer.getValue()>max){
                max=answer.getValue();
            }
        }
        for (Map.Entry<Integer,Integer> answer:sorted_birds.entrySet()) {
            if(answer.getValue()==max){
                 System.out.println(answer.getKey());
                 break;
            }
        }

    }
}
