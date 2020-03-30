/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package four1.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class CopyLines {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        PrintWriter writer = null;
        try{
            reader = new BufferedReader(new FileReader("prvi.txt"));
            String line = reader.readLine();
            while(line != null){
                System.out.println(line);
                line = reader.readLine(); 
        }
        }catch(IOException e){
            System.err.println(e.getMessage());
        }finally{
            if(reader != null){
                reader.close();
            }
        }
    }
}
