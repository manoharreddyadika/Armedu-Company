package com.example.armedu.filereading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFile {
    public static void main(String[] args) {
        String csvFile = "D:\\WorkSpace\\manohar.csv"; 

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    String[] values = line.split(","); 
                   
                    for (String value : values) {
                       
                        int intValue = Integer.parseInt(value.trim());
                        System.out.print(intValue + " ");
                    }
                    System.out.println(); 
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                   
                    System.err.println(line);
                    
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

