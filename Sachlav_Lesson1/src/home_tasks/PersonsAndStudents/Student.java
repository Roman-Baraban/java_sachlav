package home_tasks.PersonsAndStudents;

public class Student extends Person{
    String courseName;
    boolean isActive;

    public Student(String name, String email, int birthYear, String courseName, boolean isActive) {
        super(name, email, birthYear);
        this.courseName = courseName;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Student{" +
                "courseName='" + courseName + '\'' +
                ", isActive=" + isActive +
                '}';
    }

    public Student(String name, String email, int birthYear) {
        super(name, email, birthYear);
    }

    public void printInfo(){
        System.out.println("Информация");
        System.out.println(getName());
        System.out.println(getBirthYear());
        System.out.println(getEmail());
        System.out.println(courseName);
        System.out.println(isActive);
}
}
