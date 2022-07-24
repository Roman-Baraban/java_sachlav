package home_tasks.Workers;

public class Manager extends Worker implements DoNothing{

    public Manager(String name) {
        super(name);
    }

    @Override
    public void doingNothing() {
        System.out.println("I'm useless");
    }
}
