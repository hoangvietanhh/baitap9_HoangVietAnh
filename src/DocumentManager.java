import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DocumentManager {
    ArrayList<Document> documents = new ArrayList<>();
    static String fileName = "DOC.dat";
    public  void setArr(){
        documents = readFile() == null ? documents : (ArrayList<Document>) readFile();
    }

    public void addDocument(Document document){
        setArr();
        documents.add(document);
        writeFile();
    }

    public void read(){
        setArr();
        for (Document document : documents){
            System.out.println(document.toString());
        }
    }

    public void search(int code){
        setArr();
        for (Document document:documents){
            if (document.getDocumentCode() == code){
                System.out.println(document.toString());
            }
        }
    }

    public void writeFile(){
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(documents);
            oos.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public Object readFile(){
        Object file;
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            file = ois.readObject();
            ois.close();
            return file;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
