/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package six;

import java.util.Set;

public class Animal {
  private String animalType;
  private String name;
  private int id;
  private Person owner;

    public String getAnimalType() {
        return animalType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Person getOwner() {
        return owner;
    }

    public Animal setAnimalType(String animalType) {
        this.animalType = animalType;
        return this;
    }

    public Animal setId(int id) {
        this.id = id;
        return this;
    }

    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    public Animal setOwner(Person owner) {
        this.owner = owner;
        return this;
    }
  
    
}
