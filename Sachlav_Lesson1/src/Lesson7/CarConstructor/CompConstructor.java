package Lesson7.CarConstructor;

public class CompConstructor {
    public static void main(String[] args) {
        Memory[] memory = new Memory[4];
        memory[0]=new Memory(100, "A");
        memory[1]=new Memory(200, "B");
        memory[2]=new Memory(300, "C");
        memory[3]=new Memory(400, "D");

        Computer computer1 = new Computer(new GraphicCard(111111, "Nvidia"), 105.5, new Chip("Blabla", 1111, 4),
                memory, new SolidDrive("Blablabla", 343));
        Computer computer2 = new Computer(new GraphicCard(233221, "Radeon"), 1425.5, new Chip("Bleble", 13111, 6),
                memory, new SolidDrive("Blebleble", 3313));
    }
}
