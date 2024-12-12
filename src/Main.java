import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        while(true){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number of prime numbers to be generated(Enter 0 to exit): ");
            n = s.nextInt();    // To take the input number n
            if(n<0) {
                System.out.println("Please enter only a natural number.");  // Program asks to input a natural number
                continue;   //  and continues to next iteration of the while loop
            } else if (n==0) {
                break;  // When n is 0, program exits from while loop and returns from the main function
            }
            int[] primes = Primenumbers.GeneratePrimeNumbers(n);    // Calls GeneratePrimeNumbers method with argument n
            System.out.print("Numbers Generated: ");
            for (int i=0;i<primes.length;i++) {
                System.out.print(primes[i]);    // Prints the generated numbers
                if(i<primes.length-1) System.out.print(", ");
            }
            System.out.println();
            int sum = Primenumbers.SumNumbers(primes);  // Calls SumNumbers method from Primenumbers class
            System.out.println("Sum of the numbers: " + sum);   // Prints the sum of generated prime numbers
            System.out.println();
        }
        return;
    }

}

