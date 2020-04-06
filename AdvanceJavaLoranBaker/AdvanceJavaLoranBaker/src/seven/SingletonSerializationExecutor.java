package seven;

public class SingletonSerializationExecutor {

    public static void main(String[] args) {
        SingletonExecutor singletonExectuor1 = new SingletonExecutor();
        SingletonExecutor.ObjectPrinter printer = singletonExectuor1.new ObjectPrinter();
        SingletonLazy sabit = SingletonLazy.getInstance();
        printer.print("nas sabit", sabit);
    }
}
