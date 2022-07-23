package home_tasks.Zoo;

public class Gorilla extends Monkey{
    String name;

    public Gorilla(String name) {
        this.name = name;
    }

    @Override
    void howDoYouLive() {
        System.out.println("howDoYouLive: I breath oxygen");
    }

    @Override
    void howManyLegs() {
        System.out.println("howManyLegs: 2");
    }

    @Override
    void doYouDrinkMilk() {
        System.out.println("doYouDrinkMilk: Yes");
    }

    @Override
    void doYouUseTools() {
        System.out.println("doYouUseTools: Yap");
    }

    @Override
    void doYouHaveBoobs() {
        System.out.println("doYouHaveBoobs: Oh yeah");
    }

    @Override
     void tellMeEverything() {
        System.out.println("My name is " + name);
        howDoYouLive();
        howManyLegs();
        doYouDrinkMilk();
        doYouUseTools();
        doYouHaveBoobs();
        System.out.println();
    }


}