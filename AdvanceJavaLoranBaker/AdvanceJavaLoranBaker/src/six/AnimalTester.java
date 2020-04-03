/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package six;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author PC
 */
public class AnimalTester {
    public static void main(String[] args) {
        Animal zeko = new Animal()
                .setId(0)
                .setAnimalType("sisar")
                .setName("zekan")
                .setOwner(new Person(Person.Gender.MALE, "faruk", LocalDate.of(2000, Month.MARCH, 31), "Email adressa luda gmail"));
    }
}
