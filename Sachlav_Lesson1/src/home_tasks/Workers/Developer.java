package home_tasks.Workers;

public class Developer extends Worker implements Coding{
    public Developer(String name) {
        super(name);
    }

    @Override
    public void coding() {
        System.out.println("I code crap");
    }
}
