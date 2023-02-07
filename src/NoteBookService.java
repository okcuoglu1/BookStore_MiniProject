import java.util.ArrayList;
import java.util.List;

public class NoteBookService implements ProductService{

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
