public class Magazine extends Document {
    private int issueNumber;
    private int monthOfRelease;

    public Magazine() {
    }

    public Magazine(int documentCode, String publisher, int numberOfRelease, int issueNumber, int monthOfRelease) {
        super(documentCode, publisher, numberOfRelease);
        this.issueNumber = issueNumber;
        this.monthOfRelease = monthOfRelease;
    }

    public Magazine(int issueNumber, int monthOfRelease) {
        this.issueNumber = issueNumber;
        this.monthOfRelease = monthOfRelease;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getMonthOfRelease() {
        return monthOfRelease;
    }

    public void setMonthOfRelease(int monthOfRelease) {
        this.monthOfRelease = monthOfRelease;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "documentCode=" + getDocumentCode() +
                ", publisher='" + getPublisher() + '\'' +
                ", numberOfRelease=" + getNumberOfRelease() +
                "issueNumber=" + issueNumber +
                ", monthOfRelease=" + monthOfRelease +
                '}';
    }
}
