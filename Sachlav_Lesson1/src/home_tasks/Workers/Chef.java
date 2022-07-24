package home_tasks.Workers;

public class Chef extends Worker implements Cooking {
    public Chef(String name) {
        super(name);
    }

    @Override
    public void cooking() {
        System.out.println("I cook something");
    }
}
