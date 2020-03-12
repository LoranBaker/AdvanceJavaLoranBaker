
package on1.splieterator;

public enum Gender {
    MALE("Musko"), FEMALE("Zensko"), TRANS("Srednji rod");
    
    private String name;
    
    private Gender(String n){
        this.name = n;
    }
    public String getName() {
        return name;
    }

   
    
    
}
