
package two1;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import two.Gender;
import on1.splieterator.Person;

public class PersonExecutor {
    public static void main(String[] args) {
        List<Person> persons = Person.socialNetwork(); 
        PersonExecutor personExectuor = new PersonExecutor();
        personExectuor.printPersonsWithGender(persons, Gender.MALE);
        personExectuor.printPersonsOlderThan(persons, LocalDate.of(1999, Month.MARCH, 1));
        Set<Person> setOfPersons = new HashSet<>(persons);
        setOfPersons.forEach(perso -> System.out.println(perso));
    }
    
    void printPersonsWithGender (List<Person>persons, Gender gender){
        for(int i = 0; i< persons.size(); i++){
        Person p = persons.get(i);
        if(p.getGender().equals(gender)){
            System.out.println(" " + p);
        }
    }
    }
    
    void printPersonsOlderThan(List<Person> persons, LocalDate date){
        for(Person p : persons){
            if(p.getBirthday().isBefore(date)){
                System.out.println(" " + p);
            }
        }
        
    }
    
    void printPersonsYoungerThan(List<Person> persons, LocalDate date){
        persons.forEach(it->System.out.println(it));
        
    }
}
