package domain;

public class Book {

    public Book(){}

    private String title;
    private String authors;
    private Section section;
    private String annotations;
    private OGEDirection directionOGE;
    private EGEDirection directionEGE;
    private EssayDirection directionEssay;
    private int numberOfCopies;
    private int yearOfPublishing;
    private int numberOfPages;
    private boolean isHaveIllustrations;

    public Book(String title, String authors, Section section, String annotations,
                OGEDirection directionOGE, EGEDirection directionEGE, EssayDirection directionEssay,
                int numberOfCopies, int yearOfPublishing, int numberOfPages, boolean isHaveIllustrations) {
        this.title = title;
        this.authors = authors;
        this.section = section;
        this.annotations = annotations;
        this.directionOGE = directionOGE;
        this.directionEGE = directionEGE;
        this.directionEssay = directionEssay;
        this.numberOfCopies = numberOfCopies;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.isHaveIllustrations = isHaveIllustrations;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public String getAnnotations() {
        return annotations;
    }

    public void setAnnotations(String annotations) {
        this.annotations = annotations;
    }

    public OGEDirection getDirectionOGE() {
        return directionOGE;
    }

    public void setDirectionOGE(OGEDirection directionOGE) {
        this.directionOGE = directionOGE;
    }

    public EGEDirection getDirectionEGE() {
        return directionEGE;
    }

    public void setDirectionEGE(EGEDirection directionEGE) {
        this.directionEGE = directionEGE;
    }

    public EssayDirection getDirectionEssay() {
        return directionEssay;
    }

    public void setDirectionEssay(EssayDirection directionEssay) {
        this.directionEssay = directionEssay;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public boolean isHaveIllustrations() {
        return isHaveIllustrations;
    }

    public void setHaveIllustrations(boolean haveIllustrations) {
        isHaveIllustrations = haveIllustrations;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors='" + authors + '\'' +
                ", section='" + section + '\'' +
                ", annotations='" + annotations + '\'' +
                ", directionOGE='" + directionOGE + '\'' +
                ", directionEGE='" + directionEGE + '\'' +
                ", directionEssay='" + directionEssay + '\'' +
                ", numberOfCopies=" + numberOfCopies +
                ", yearOfPublishing=" + yearOfPublishing +
                ", numberOfPages=" + numberOfPages +
                ", isHaveIllustrations=" + isHaveIllustrations +
                '}';
    }
}
