package HomeWork8;

public class Director implements Info {
    @Override
    public void getInfo() {
        System.out.println("Position: " +getClass().getSimpleName() );
    }
}
