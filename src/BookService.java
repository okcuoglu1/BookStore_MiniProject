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
        listProduct();

    }

    @Override
    public void removeProduct() {
        System.out.print("Please enter the id: ");
        int revId = scanner.nextInt();
        boolean isExist = true;

        for (Book book : this.bookList){

            if(book.getId()==revId){

                bookList.remove(book);
                System.out.println("Book is removed");
                listProduct();
            }else{
                isExist = false;
            }

            if(!isExist){

                System.out.println("Book is not found! ");
            }



        }

    }

    @Override
    public void processMenu() {
        int select = -1;
        while (select!=0){
            System.out.println("1-Book add");
            System.out.println("2-Book remove");
            System.out.println("3-Book list");
            System.out.println("4-Book list");
            System.out.println("5-Filter by publisher ");
            System.out.println("Your choice: ");
            select = scanner.nextInt();

            switch (select){

                case 0:
                    System.out.println("You are redirected to the main menu");
                    break;
                case 1:
                    addProduct();
                case 2:
                    removeProduct();
                case 3:
                    listProduct();
                case 4:
                    System.out.println("Please enter the publisher");
                    String pub = scanner.nextLine();
                    filterProduct(pub);
                default:
                    System.out.println("Invalid Choice!");
                    break;

            }

        }









    }

    @Override
    public void filterProduct(String filter) {


        for (Book book : this.bookList){

            if(book.getPublisher().equalsIgnoreCase(filter)){
                System.out.printf("%-2s | %-15s | %-15s | %-10s | %-7s | %-5s \n",
                        book.getId(),book.getName(),book.getAuthorName(),book.getPublisher(),book.getPrice(),book.getStock());
            }

        }







    }

    @Override
    public void listProduct() {

        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.printf("%-2s | %-15s | %-15s | %-10s | %-7s | %-5s \n","ID","Book Name","Author Name","Publisher","Price","Stock");
        System.out.println("---------------------------------------------------------------------------------------------------------");

        for (Book book : this.bookList){

            System.out.printf("%-2s | %-15s | %-15s | %-10s | %-7s | %-5s \n",
                    book.getId(), book.getName(), book.getAuthorName(), book.getPublisher(), book.getPrice(),book.getStock());



        }

    }
}
