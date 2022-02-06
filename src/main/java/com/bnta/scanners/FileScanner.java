package com.bnta.scanners;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class FileScanner{
    public static void main(String[] args) throws IOException {

        try {

            File file = new File("src/main/java/com/bnta/scanners/input.txt");

            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());

            }
            } catch(IOException e){
                System.out.println("File Not found");
            }

        }
    }


