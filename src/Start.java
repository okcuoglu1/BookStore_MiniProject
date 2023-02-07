import java.sql.SQLOutput;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        start();
    }




    public static void start(){

        Scanner scanner = new Scanner(System.in);
        int select = -1;

        while(select!=0){

            System.out.println("-----Welcome to the Tech Book Store-----");
            System.out.println("1-Books");
            System.out.println("2-NoteBooks");
            System.out.println("0-Exit");
            System.out.print("Your Select: ");
            select = scanner.nextInt();

            ProductService service = select==1 ? new BookService() : new NoteBookService();

            if(select==1 || select==2){
                service.processMenu();
            }else if(select==0) {
                System.out.println("Goodbye!!");
            }else{
                System.out.println("Invalid Number");
            }







        }





    }









}
