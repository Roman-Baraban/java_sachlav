package home_tasks.PersonsAndStudents;

public class ListOfStudents {
    public static void main(String[] args) {
        Person student1 = new Student("Lelik","111@222.ru", 1992, "Math", true);
        Person student2 = new Student("Bolik","222@333.ru", 1990, "Hebrew", false);
        Person student3 = new Student("Borik","333@444.ru", 1988, "Cosmology", true);

        System.out.println(student1);
        student1.printInfo();
        System.out.println(student2);
        student2.printInfo();
        System.out.println(student2);
        student2.printInfo();
    }
}
