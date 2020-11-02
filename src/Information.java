import java.util.Scanner;

public class Information {
    Scanner input = new Scanner(System.in);

    public Document addInfo(Document document){
        System.out.println("Enter document code: ");
        document.setDocumentCode(Integer.parseInt(input.nextLine()));
        System.out.println("Enter publisher: ");
        document.setPublisher(input.nextLine());
        System.out.println("Enter number of release: ");
        document.setNumberOfRelease(Integer.parseInt(input.nextLine()));
        return document;
    }

    public void addNewspaper(Document document){
        System.out.println("Enter release day: ");
        ((Newspaper)document).setReleaseDate(Integer.parseInt(input.nextLine()));
    }

    public void addMagazine(Document document){
        System.out.println("Enter  issue No. :");
        ((Magazine)document).setIssueNumber(Integer.parseInt(input.nextLine()));
        System.out.println("Enter release month: ");
        ((Magazine)document).setMonthOfRelease(Integer.parseInt(input.nextLine()));
    }

    public void addBook(Document document){
        System.out.println("Enter author name: ");
        ((Book)document).setAuthor(input.nextLine());
        System.out.println("Enter total page number: ");
        ((Book)document).setNumberOfPage(Integer.parseInt(input.nextLine()));
    }
}
