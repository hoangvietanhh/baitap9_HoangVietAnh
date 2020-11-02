import java.io.Serializable;

public class Document implements Serializable {
    private int documentCode;
    private String publisher;
    private int numberOfRelease;

    public Document(int documentCode, String publisher, int numberOfRelease) {
        this.documentCode = documentCode;
        this.publisher = publisher;
        this.numberOfRelease = numberOfRelease;
    }

    public Document() {
    }

    public int getDocumentCode() {
        return documentCode;
    }

    public void setDocumentCode(int documentCode) {
        this.documentCode = documentCode;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumberOfRelease() {
        return numberOfRelease;
    }

    public void setNumberOfRelease(int numberOfRelease) {
        this.numberOfRelease = numberOfRelease;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentCode=" + documentCode +
                ", publisher='" + publisher + '\'' +
                ", numberOfRelease=" + numberOfRelease +
                '}';
    }
}
