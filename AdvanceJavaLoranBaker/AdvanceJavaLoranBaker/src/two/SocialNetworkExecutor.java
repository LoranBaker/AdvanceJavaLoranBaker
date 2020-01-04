/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package two;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Function;

public class SocialNetworkExecutor {

    public static void main(String[] args) {
        List<Person> listOfPersons = Person.socialNetwork();
        Function<Person, LocalDate> transformerIzPersonString = p->p.getBirthday();
        listOfPersons.stream()//1. 
                .filter(p -> p.getGender().equals(Gender.FEMALE))//2.
                .map(p->p.getBirthday())//2.
                .forEach(name -> System.out.println(name));//3.
    }
}