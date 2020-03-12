/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package four.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        double sum = 0.0;
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("prvi.txt")))) {
            scanner.useLocale(Locale.US);
            while (scanner.hasNext()) {
                if(scanner.hasNextDouble()){
                    sum = sum+scanner.nextDouble();
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("SUMA  = " + sum);
        writeToFile("prvi.txt", sum+"");
    }
    
    private static void writeToFile(String fileName, String content){
        try(PrintWriter writer = new PrintWriter(new FileWriter(fileName))){
            writer.println(content);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}