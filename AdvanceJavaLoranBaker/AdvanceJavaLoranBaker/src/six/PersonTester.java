/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package six;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class PersonTester {

    public static void main(String[] args) {
        List<Person> personList = Person.socialNetwork();//upit na bazu
        Consumer<Person> personConsumer = new Consumer<Person>() {
            
            @Override
            public void accept(Person t) {
                System.out.println("Ja sam konzumer i konzumira objekat person koji se zove :" + t.getName());
            }
            
        };
        Consumer<Person> personConsumer1 = p -> (System.out.println("Vozdra iz lambde " + p.getName()));
        personConsumer.accept(personList.get(0));
        personConsumer1.accept(personList.iterator().next());
        
        Supplier<Person> personSupplier;
        Predicate<Person> personTester;
        Function<Person, String> transformFromPersonToString;
        PersonTester tester = new PersonTester();
        //c++
        System.out.println("c++");
        for (int i = 0; i < personList.size(); i++) {
            Person p = personList.get(i);
            tester.printPerson(p);
            
        }        
        System.out.println("Enhanced for petlja ");
        for (Person p : personList) {
            if(p.getName().equals("tarik")){
            tester.printPerson(p);
        }
        }
        System.out.println("for each petlja");
        Predicate<Person> testerTarik = it-> it.getName().equals("tarik");
        Function<Person, String> transofrmer = p->p.getName();
        personList
                .stream()
                .filter(it -> it.getName().equals("tarik"))
                .map(transofrmer)
                .forEach(it -> System.out.println(it));//terminirajuca operacija
      
        List<LocalDate> birthdays = personList
                .stream()
                .map(p->p.getBirthday())
                .collect(Collectors.toList());//terminirajuca operacija
        //1.referenciranje na funkiju od objekta tester
        personList.stream().filter(it->it.getGender().equals(Person.Gender.FEMALE))
                .forEach(tester::printPerson);
    }
        

    private void printPerson(Person person) {
        System.out.println(" name " + person.getName() + " gender: " + person.getGender() + " Email " + person.getEmailAddress());
    }
}
