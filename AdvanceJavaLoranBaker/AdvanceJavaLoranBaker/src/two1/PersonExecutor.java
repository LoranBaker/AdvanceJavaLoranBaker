
package two1;

import java.time.LocalDate;
import java.time.Month;
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
        System.out.println("print persons between dates");
        personExectuor.printPersonsBetweenDates(persons, LocalDate.of(1998, Month.MARCH, 3), LocalDate.MAX);
        
    }
   /* 
    void printPersons(List<Person>persons, CheckPerson checkPerson){
        persons.stream()
                .filter(p->checkPerson.check(p)) 
                .forEach(it->System.out.println(it));
    
    }*/
    
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
    void printPersonsBetweenDates(List<Person> persons, LocalDate fromDate, LocalDate toDate){
        persons.stream()
                .filter(p->p.getBirthday().isAfter(fromDate))
                .filter(p->p.getBirthday().isBefore(toDate))
                .forEach(it->System.out.println(it));
    }
}
