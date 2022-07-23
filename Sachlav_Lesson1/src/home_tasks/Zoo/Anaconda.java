package home_tasks.Zoo;

public class Anaconda extends Snake{
    String name;

    public Anaconda(String name) {
        this.name = name;
    }

    @Override
    void howDoYouLive() {
        System.out.println("howDoYouLive: I breath oxygen");
    }

    @Override
    void howManyLegs() {
        System.out.println("howManyLegs: Null");
    }

    @Override
    void howDoYouDiffer() {
        System.out.println("howDoYouDiffer: I'm big");
    }

    @Override
    void doYouDrinkMilk() {
        System.out.println("doYouDrinkMilk: Nope");
    }

    void tellMeEverything(){
        System.out.println("My name is " + name);
        howDoYouLive();
        howManyLegs();
        doYouDrinkMilk();
        howDoYouDiffer();
        System.out.println();

    }
}
