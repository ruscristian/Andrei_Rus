package tema.sci.library_catalog;

public class Book {

    private String name;
    private String pages;

    public Book(String name, String pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public String getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages='" + pages + '\'' +
                '}';
    }
}
