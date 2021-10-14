package tema.sci.library_catalog;

import java.util.LinkedList;
import java.util.List;

public class Novel extends Book {


    private String genre;

    public Novel(String name, String pages, String genre) {
      super(name, pages);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "name='" + super.getName() + '\'' +
                "pages='" + super.getPages() + '\'' +
                "genre='" + genre + '\'' +
                '}';
    }
}
