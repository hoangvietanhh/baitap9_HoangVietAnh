import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        DocumentManager documentManager = new DocumentManager();
        Information information = new Information();
        Scanner input = new Scanner(System.in);
        boolean check = true;

        do {
            System.out.println("1: Create new document.");
            System.out.println("2: Show document.");
            System.out.println("3: Search document by code.");
            System.out.println("0: Exit.");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    System.out.println("1. Create new newspaper.");
                    System.out.println("2. Create new magazine.");
                    System.out.println("3. Create new book.");
                    int select = Integer.parseInt(input.nextLine());
                    switch (select){
                        case 1:
                            Newspaper newspaper = new Newspaper();
                            information.addNewspaper(information.addInfo(newspaper));
                            documentManager.addDocument(newspaper);
                            documentManager.read();
                            break;
                        case 2:
                            Magazine magazine = new Magazine();
                            information.addMagazine(information.addInfo(magazine));
                            documentManager.addDocument(magazine);
                            documentManager.read();
                            break;
                        case 3:
                            Book book = new Book();
                            information.addBook(information.addInfo(book));
                            documentManager.addDocument(book);
                            documentManager.read();
                            break;
                    }
                    break;
                case 2:
                    documentManager.read();
                    break;
                case 3:
                    System.out.println("Enter code to search: ");
                    int code = Integer.parseInt(input.nextLine());
                    documentManager.search(code);
                    break;
                case 0:
                    check = false;
            }
        }while (check);
    }
}
