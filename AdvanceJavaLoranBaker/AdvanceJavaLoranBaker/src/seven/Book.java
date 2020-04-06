
package seven;

import java.time.LocalDate;
import java.util.List;
import jdk.nashorn.internal.codegen.CompilerConstants;

public class Book {
    
    private static int autoIncrement = 0;

    private int identity;
    private List<String> authors;
    private String title;
    private LocalDate dateOfPublishment;

    private Book(int identity, String author, String title) {
        this.identity=identity;
        this.authors.add(author);
        this.title = title;
        
    }
    private Book(String title,String author, LocalDate dateOfPublishment){
        this.title = title;
        this.dateOfPublishment = dateOfPublishment;
        this.authors.add(author);
        autoIncrement++;
    }
    
    

    public List<String> getAuthors() {
        return authors;
    }

    public LocalDate getDateOfPublisment() {
        return dateOfPublishment;
    }

    public int getIdentity() {
        return identity;
    }

    public String getTitle() {
        return title;
    }
    
    //Static Factory Method pattern
    public static Book of(int identity, String author, String title){
       return new Book(identity, author, title);
    }
    
    public static Book withoutIdentity(String title, String author, LocalDate dateOfPublishment){
        Book book1 = new Book(title, author, dateOfPublishment);
        book1.identity = autoIncrement;
        return book1;
    }
    
}
