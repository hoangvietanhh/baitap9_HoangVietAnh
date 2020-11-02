public class Book extends Document {
    private String author;
    private int numberOfPage;

    public Book() {
    }

    public Book(int documentCode, String publisher, int numberOfRelease, String author, int numberOfPage) {
        super(documentCode, publisher, numberOfRelease);
        this.author = author;
        this.numberOfPage = numberOfPage;
    }

    public Book(String author, int numberOfPage) {
        this.author = author;
        this.numberOfPage = numberOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "documentCode=" + getDocumentCode() +
                ", publisher='" + getPublisher() + '\'' +
                ", numberOfRelease=" + getNumberOfRelease() +
                "author='" + author + '\'' +
                ", numberOfPage=" + numberOfPage +
                '}';
    }
}
