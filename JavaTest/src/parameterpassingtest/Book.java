package parameterpassingtest;

/**
 * Created by dela on 9/23/17.
 */
public class Book {
    public String name;
    public String artist;


    public static void main(String[] args){
        Book book = new Book();
        book.name = "Java学习笔记";
        book.artist = "林信良";

        Book book1 = book;

        System.out.println(book.name);
        System.out.println(book1.name);
    }
}
