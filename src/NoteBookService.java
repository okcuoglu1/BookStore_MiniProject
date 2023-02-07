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

        System.out.print("Please enter the id: ");
        int revId = scanner.nextInt();
        boolean isExist = true;

        for (Notebook notebook : this.notebookList){

            if(notebook.getId()==revId){

                notebookList.remove(notebook);
                System.out.println("Notebook is removed");
                listProduct();
            }else{
                isExist = false;
            }

            if(!isExist){

                System.out.println("Notebook is not found! ");
            }



        }




    }

    @Override
    public void processMenu() {

        int select = -1;
        while (select!=0){
            System.out.println("1-NoteBook add");
            System.out.println("2-NoteBook remove");
            System.out.println("3-NoteBook list");
            System.out.println("4-NoteBook list");
            System.out.println("5-Filter by Sheet ");
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
                    //listProduct();
                case 4:
                    System.out.println("Please enter the Sheet");
                    String pub = scanner.nextLine();

                default:
                    System.out.println("Invalid Choice!");
                    break;

            }
        }
    }

    @Override
    public void filterProduct(String filter) {

            for (Notebook notebook : this.notebookList){

                if(notebook.getSheet().equalsIgnoreCase(filter)){

                    System.out.printf("%-2s | %-15s | %-15s | %-10s | %-7s | %-5s \n",
                            notebook.getId(),notebook.getName(),notebook.getBrand(),notebook.getSheet(),notebook.getPrice(),notebook.getStock());

                }


            }

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
