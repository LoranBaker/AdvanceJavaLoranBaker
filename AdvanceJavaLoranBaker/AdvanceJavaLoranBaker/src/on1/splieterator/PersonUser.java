package on1.splieterator;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class PersonUser {

    public static void main(String[] args) {
        List<Person> persons = Person.socialNetwork();
        /*
       CheckPerson checker = (Person p) -> p.getAge()>22;
        printPerson(persons, (p)->p.getAge()<22);
        
        persons.stream().filter(p->p.getAge()>22.forEach(System.out::println));
        
        */
        printPersonOlderThan(persons, 30);
        System.out.println("");
        printPersonYoungerThan(persons, 20);
        System.out.println("");
        printPersonWithGender(persons, Gender.FEMALE);
        System.out.println("");
        printPersonWithGender(persons, Gender.TRANS);
    }
    
    static void printPerson(List<Person> persons, checkPerson checkPerson){
        for(Person p: persons){
            if(checkPerson.checkPerson(p)){
                System.out.println(p);
            }
        }
        
    }

    static void printPersonWithTheRange(List<Person> persons, LocalDate min, LocalDate max) {
        for (Person p : persons) {
            if (p.getBirthday().getYear() >= min.getYear() && p.getBirthday().getYear() <= max.getYear()) {
                System.out.println(p);
            }
        }
    }

    static void printPersonOlderThan(List<Person> persons, int age) {
        for (Person p : persons) {
            if (p.getAge() > age) {
                System.out.println(p);
            }
        }

    }

    static void printPersonYoungerThan(List<Person> persons, int age) {
        for (Person p : persons) {
            if (p.getAge() < age) {
                System.out.println(p);
            }
        }
    }

    static void printPersonWithGender(List<Person> persons, Gender spol) {
        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Person next = iterator.next();
            if (next.getGender().equals(spol)) {
                System.out.println(next);
            }
        }

    }
}
