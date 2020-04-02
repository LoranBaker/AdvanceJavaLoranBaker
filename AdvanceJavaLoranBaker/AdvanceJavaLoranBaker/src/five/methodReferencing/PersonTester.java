
package five.methodReferencing;

import java.util.Comparator;
import java.util.List;

public class PersonTester {
    public static void main(String[] args) {
        List<Person> persons = Person.socialNetwork();
        Print(persons);
        
    }
    
    private static void Print(List<Person> persons){
        persons.stream().map(it->it.getBirthday()).forEach(b->System.out.println(b.toString()));
    }
    
    class PersonComparator implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getBirthday().compareTo(o2.getBirthday());
        }
    
    }
}
