package com.bnta.scanners;

import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(new InputStreamReader(System.in));
        System.out.println("Please enter your name");
        String input = scan.nextLine();



        System.out.println(args);
    }
}
