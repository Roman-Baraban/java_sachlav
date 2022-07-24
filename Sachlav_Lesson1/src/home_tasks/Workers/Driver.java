package home_tasks.Workers;

public class Driver extends Worker implements Driving{
    public Driver(String name) {
        super(name);
    }

    @Override
    public void driving() {
        System.out.println("I drive somewhere");
    }
}
