
package on1.splieterator;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String surname;
    private Gender gender;
    private final LocalDate birthday;

    public Person(String name, String surname, Gender gender, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    
    public int getAge(){
       LocalDate currentDate =  LocalDate.now();
       int years = birthday.until(currentDate).getYears();
       return years;
    }

    @Override
    public String toString() {
        return name + ", " + surname + ", " + gender.getName() + ", "+ birthday.toString();
    }
    
    
    public static List<Person> socialNetwork(){
        List<Person> socialNetworkList = new ArrayList<>();
        socialNetworkList.add(new Person("Loran", "Baker", Gender.MALE, LocalDate.of(1999, Month.JANUARY, 31)));
        socialNetworkList.add(new Person("Faruk", "Topuz", Gender.MALE, LocalDate.of(1998, Month.APRIL, 22)));
        socialNetworkList.add(new Person("Amar", "Hodzic", Gender.MALE, LocalDate.of(1991, Month.DECEMBER, 19)));
        socialNetworkList.add(new Person("Mahir", "Babic", Gender.MALE, LocalDate.of(2000, Month.JUNE, 11)));
        socialNetworkList.add(new Person("Fadil", "Turalic", Gender.MALE, LocalDate.of(1981, Month.MAY, 2)));
        socialNetworkList.add(new Person("Emir", "Puska", Gender.TRANS, LocalDate.of(1988, Month.SEPTEMBER, 21)));
        socialNetworkList.add(new Person("Ferida", "Bobar", Gender.FEMALE, LocalDate.of(1999, Month.JANUARY, 31)));
        return socialNetworkList;
    }    
    
    /*
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1999, Month.AUGUST, 23);
        LocalDate currentDate = LocalDate.now();
        Period period = birthday.until(currentDate);
        System.out.println("Godina = " + period.getYears() + ", Months = " + period.getMonths() + ", Days= " + period.getDays());
    }*/
    
}
