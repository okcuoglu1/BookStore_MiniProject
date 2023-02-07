import java.util.ArrayList;
import java.util.List;

public class BookService implements ProductService{
    List<Book> bookList = new ArrayList<>();
    public BookService(){
        Book book1 = new Book(1,"Hayvan Çiftliği",15.50,10,"George Orwell","Can");
        Book book2 = new Book(2,"Satranç",8.50,10,"Stefan Zweig","İş Bankası");
        Book book3 = new Book(3,"Dönüşüm",10.50,10,"Franz Kafka","İş Bankası");
        Book book4 = new Book(4,"Kuyucaklı Yusuf",13.50,10,"Sabahattin Ali","YKY");
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

    }













    @Override
    public void addProduct() {

    }

    @Override
    public void removeProduct() {

    }

    @Override
    public void processMenu() {








    }

    @Override
    public void filterProduct(String filter) {

    }

    @Override
    public void listProduct() {

    }
}
