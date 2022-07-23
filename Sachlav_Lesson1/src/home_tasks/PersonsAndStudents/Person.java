package home_tasks.PersonsAndStudents;

import javax.xml.namespace.QName;

public class Person {
    private String name;
    private String email;
    private int birthYear;

    public void printInfo(){
        System.out.println("Информация об охломоне");
        System.out.println(name);
        System.out.println(email);
        System.out.println(birthYear);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person(String name, String email, int birthYear) {
        this.name = name;
        this.email = email;
        this.birthYear = birthYear;
    }
}
