/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package two1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {
    
    private String name;
    private String surname;
    private LocalDate birthday;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getAge(){
        LocalDate currentDate = LocalDate.now();
        int years = birthday.until(currentDate).getYears();
        return years;
    }

    @Override
    public String toString() {
        return name + ", " + surname + ", " + birthday.toString();
        }  
}
