/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package six;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {

    public enum Gender {

        MALE,
        FEMALE;
    }

    private Gender gender;
    private String name;
    private LocalDate birthday;
    private String emailAddress;

    public Person(Gender gender, String name, LocalDate birthday, String emailAddress) {
        this.gender = gender;
        this.name = name;
        this.birthday = birthday;
        this.emailAddress = emailAddress;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        int age = LocalDate.now().until(birthday).getYears();
        return age;
    }
     public static List<Person> socialNetwork() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(Gender.MALE, "Loran", LocalDate.now(), "loran9599@gmail.com"));
        persons.add(new Person(Gender.MALE, "tarik", LocalDate.now(), "tarik9599@gmail.com"));
        persons.add(new Person(Gender.MALE, "fark", LocalDate.now(), "fark599@gmail.com"));
        persons.add(new Person(Gender.FEMALE, "maca", LocalDate.now(), "maca9599@gmail.com"));
        persons.add(new Person(Gender.FEMALE, "cuko", LocalDate.now(), "cuko9599@gmail.com"));
        persons.add(new Person(Gender.MALE, "Loran", LocalDate.now(), "loran9599@gmail.com"));
        return persons;
    }
}
