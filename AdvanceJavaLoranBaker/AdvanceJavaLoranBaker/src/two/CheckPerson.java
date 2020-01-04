/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package two;

import two.Person;
@FunctionalInterface
public interface CheckPerson {
 // -> LAMBDA 
    public boolean check(Person person);
}