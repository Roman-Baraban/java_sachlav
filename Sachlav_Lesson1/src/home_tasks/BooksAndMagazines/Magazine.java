package home_tasks.BooksAndMagazines;

public class Magazine implements Printable {
    public void print(){
        System.out.println(magazineName);
    }
    String magazineName;

    @Override
    public String toString() {
        return "Magazine{" +
                "magazineName='" + magazineName + '\'' +
                '}';
    }

    public String getMagazineName() {
        return magazineName;
    }

    public void setMagazineName(String magazineName) {
        this.magazineName = magazineName;
    }

    public Magazine(String magazineName) {
        this.magazineName = magazineName;
    }
}
