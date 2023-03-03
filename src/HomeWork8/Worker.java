package HomeWork8;

public class Worker implements Info {
    @Override
    public void getInfo() {
        System.out.println("Position: " +getClass().getSimpleName() );
    }
}
