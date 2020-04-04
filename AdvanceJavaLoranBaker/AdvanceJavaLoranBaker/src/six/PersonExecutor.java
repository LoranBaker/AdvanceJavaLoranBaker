/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package six;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PersonExecutor {

    public static void main(String[] args) {
        class Printer {

            void print(Person p) {
                System.out.println(p.getName() + " -> " + p.getBirthday());
            }
        }
        Printer printer = new Printer();
        List<Person> personList = Person.socialNetwork();
        //prvi tip method referenciranja
        personList
                .stream()
                .filter(p -> p.getGender().equals(Person.Gender.FEMALE))
                //imeObjekta::imeMetode
                .forEach(printer::print);
        //drugi tip method referenciranja
        personList.stream()
                .filter(p -> p.getGender().equals(Person.Gender.MALE))
                //imeKlase::imeMetode
                .forEach(PersonExecutor::print);
        class ComparisonProvider {

            public int compareByName(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }

            public int compareByBirthday(Person p1, Person p2) {
                return p1.getBirthday().compareTo(p2.getBirthday());
            }
        }
        ComparisonProvider comparisonProvider = new ComparisonProvider();
        Collections.sort(personList, comparisonProvider::compareByBirthday);
        Collections.sort(personList, comparisonProvider::compareByName);
        
        String [] namesArray = {"maca", "cuko ", "ptica", "riba", "zaba"};
        Arrays.sort(namesArray,(n1, n2)->n1.compareToIgnoreCase(n2) );

        // treci tip method referenciranja
        String[] personNames = (String[]) personList
                .stream()
                .map(Person::getName)
                .collect(Collectors.toList()).toArray();
    }

    public static void print(Person p) {
        System.out.println("Muski rod" + p.getName());
    }
}
