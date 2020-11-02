public class Newspaper extends Document{
    private int releaseDate;

    public Newspaper() {
    }

    public Newspaper(int documentCode, String publisher, int numberOfRelease, int releaseDate) {
        super(documentCode, publisher, numberOfRelease);
        this.releaseDate = releaseDate;
    }

    public Newspaper(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "documentCode=" + getDocumentCode() +
                ", publisher='" + getPublisher() + '\'' +
                ", numberOfRelease=" + getNumberOfRelease() +
                "releaseDate=" + releaseDate +
                '}';
    }
}
