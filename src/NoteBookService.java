import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoteBookService implements ProductService{

    Scanner scanner = new Scanner(System.in);
    List<Notebook> notebookList = new ArrayList<>();

    public NoteBookService() {
        Notebook notebook1 = new Notebook(1,"Kareli Okul Defteri",25.50,10,"Faber-Castell","120");
        Notebook notebook2 = new Notebook(2,"Çizgili Okul Defteri",20.50,10,"Gıpta","100");
        Notebook notebook3 = new Notebook(3,"Resim Defteri",32.50,10,"Faber-Castell","80");
        notebookList.add(notebook1);
        notebookList.add(notebook2);
        notebookList.add(notebook3);
    }

    @Override
    public void addProduct() {
        System.out.print("Notebook Name: ");
        String notebookName = scanner.nextLine();
        System.out.print("Notebook Price: ");
        scanner.nextLine(); //dummy
        double notebookPrice = scanner.nextDouble();
        System.out.print("Stock: ");
        int stock = scanner.nextInt();
        System.out.print("Brand Name: ");
        String brandName = scanner.nextLine();
        System.out.print("Publisher: ");
        String sheet = scanner.nextLine();

        Notebook newNoteBook = new Notebook(this.notebookList.get(notebookList.size()-1).getId(),notebookName,notebookPrice,stock,brandName,sheet);
        this.notebookList.add(newNoteBook);
        listProduct();

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
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.printf("%-2s | %-15s | %-15s | %-10s | %-7s | %-5s \n","ID","Notebook Name","Brand Name","Sheet","Price","Stock");
        System.out.println("---------------------------------------------------------------------------------------------------------");

        for (Notebook noteBook : this.notebookList){

            System.out.printf("%-2s | %-15s | %-15s | %-10s | %-7s | %-5s \n",
                    noteBook.getId(),noteBook.getName(),noteBook.getBrand(),noteBook.getSheet(),noteBook.getPrice(),noteBook.getStock());




        }

    }
}
