package HomeWork8;

public class Accountant implements Info {
    @Override
    public void getInfo() {
        System.out.println("Position: " +getClass().getSimpleName() );
    }

}
