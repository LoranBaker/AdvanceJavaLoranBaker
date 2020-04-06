/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seven;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author PC
 */
public class SevenExecutor {
    public static void main(String[] args) {
        Book book = Book.of(0, "Mahir", "Java for dummies");
        Book book1 = Book.withoutIdentity("Effective Java", "Josh block", LocalDate.of(2005, Month.MARCH, 31));
    }
    
}
