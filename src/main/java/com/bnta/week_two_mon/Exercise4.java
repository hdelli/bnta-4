package com.bnta.week_two_mon;

import java.util.Scanner;


public class Exercise4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = s.nextInt(); //nextint but if it was a line it would be nextline, this connects it to the scanner
        if (isPrime(n)) {
            System.out.println(n + "is prime number");
        } else {
            System.out.println(n + "is not a prime number");
        }


    }

    public static boolean isPrime(int n) {
        if (n <= 1) { //1 or any number lower than 1 it is not a prime number
            return false;
        }

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) { //if number divided by another and remainder is 0 then it is not a prime thus false
                return false;
            }

        }
        return true; //if anything else then it is a prime number
    }

}









/* ATTEMPT 1

        int temp;
        boolean isPrime=true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");

        int num= Integer.parseInt(scan.nextLine());
        scan.close();
        for(int i=2; i<=num/2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;

            }
        }
         if(isPrime)
             System.out.println(num+ "a Prime number");
        } else {
            System.out.println("Not a prime number");
        }


    }
}

 */