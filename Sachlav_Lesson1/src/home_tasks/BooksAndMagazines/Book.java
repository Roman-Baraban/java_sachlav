package home_tasks.BooksAndMagazines;

public class Book implements Printable  {
    public void print(){
        System.out.println(bookName);
    }
    String bookName;

    public String getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                '}';
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }



}
