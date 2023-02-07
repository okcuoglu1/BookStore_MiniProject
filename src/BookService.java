import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService implements ProductService{

    Scanner scanner = new Scanner(System.in);

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
        System.out.print("Book Name: ");
        String bookName = scanner.nextLine();
        System.out.print("Book Price: ");
        scanner.nextLine(); //dummy
        double bookPrice = scanner.nextDouble();
        System.out.print("Stock: ");
        int stock = scanner.nextInt();
        System.out.print("Author Name: ");
        String authName = scanner.nextLine();
        System.out.print("Publisher: ");
        String pub = scanner.nextLine();
        Book newBook = new Book(this.bookList.get(bookList.size()-1).getId()+1,bookName,bookPrice,stock,authName,pub);
        this.bookList.add(newBook);


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
