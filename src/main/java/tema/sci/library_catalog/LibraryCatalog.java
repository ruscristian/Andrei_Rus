package tema.sci.library_catalog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryCatalog {


    Map<String, List<Book>> itemsByCriteria = new HashMap<>();
    private List<Book> catalog = new ArrayList<>();


    public void addBook(Book item) {
        catalog.add(item);
        if (item instanceof Novel) {
            List<Book> itemsByKey = itemsByCriteria.computeIfAbsent(((Novel) item).getGenre(), k -> new ArrayList<>());
            itemsByKey.add(item);
        } else if (item instanceof ArtAlbum) {
            List<Book> itemsByKey = itemsByCriteria.computeIfAbsent(((ArtAlbum) item).getQuality(), k -> new ArrayList<>());
            itemsByKey.add(item);
        }
    }

    public List<Book> getItemsByCriteria(String key) {
        return itemsByCriteria.getOrDefault(key, new ArrayList<>());
    }

    public List<Book> listAllBooks(){
        return catalog;
    }

    public void deleteBook(Book item) {
        catalog.remove(item);
        if (item instanceof Novel) {
            itemsByCriteria.get(((Novel) item).getGenre()).remove(item);
        } else if (item instanceof ArtAlbum) {
            itemsByCriteria.get(((ArtAlbum) item).getQuality()).remove(item);
        }
    }

    @Override
    public String toString() {
        return "LibraryCatalog{" +
                "itemsByCriteria=" + itemsByCriteria +
                ", catalog=" + catalog +
                '}';
    }
}
