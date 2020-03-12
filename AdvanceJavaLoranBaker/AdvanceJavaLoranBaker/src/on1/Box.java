
package on1;

public class Box<T> {
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
    
    public<U extends Number> void inspect(U u){
        System.out.println("T je tipa: " + object.getClass().getName());
        System.out.println("U je tipa: " + u.getClass().getName());
    }
    
    public static void main(String[] args) {
        Box<String> box1= new Box<>();
        System.out.println(box1);
    }
    
}
