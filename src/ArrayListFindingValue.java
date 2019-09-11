/*
Create an ArrayList that can hold Integers, and fill each slot with a different random value from 1-50. Display those
values on the screen, and then prompt the user for an integer. Search through the ArrayList, and if the item is present,
 say so. It is not necessary to display anything if the value was not found. If the item is in the ArrayList multiple
 times, it's okay if the program prints the message more than once.

Bonus: Only display one message. Either: # was not found or # was found 5 times. (Or however many times that it occurs)
 */


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

public class ArrayListFindingValue {

    public static void main(String[] args){

        int inNum = 0;
        String answer = "Y";

        ArrayList<Integer> al = new ArrayList<>();

        // Populating ArrayList with random values
        for(int i=0; i<=50; i++){
            Random rnd = new Random();
            int rndValue = rnd.nextInt(50)+1;
            al.add(rndValue);
        }
        //System.out.println("Printing ArrayList values: " + al);

        Scanner input = new Scanner(System.in);


        while(answer.equalsIgnoreCase("Y")) {
            System.out.println("\nDo you want to enter a number? (Y/N)");
            answer = input.next();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("\nPlease enter a number");
                System.out.println("----------------------------");
                inNum = input.nextInt();

                if (al.contains(inNum)) {
                     // counting the number of occurrences of number entered by user
                    int occurrences = Collections.frequency(al, inNum);
                    System.out.println("***** Great " + inNum + " is in ArrayList. *****");
                    System.out.println("*****  " + inNum + " was found "+occurrences + " time(s). *****");
                }
                else{
                    System.out.println("***** Oops! " + inNum + " was not found in ArrayList. *****");
                }
            }
            System.out.println("\nPlease enter another number");
            System.out.println("Or, press \"Q\" to quit !!!");
            System.out.println("---------------------------------");
        }
    }
}
