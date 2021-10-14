package tema.sci.library_catalog;

import java.util.LinkedList;
import java.util.List;

public class ArtAlbum extends Book{


    private String quality;


    public ArtAlbum(String name, String pages, String quality) {
        super(name, pages);
        this.quality = quality;
    }

    public String getQuality() {
        return quality;
    }

    @Override
    public String toString() {
        return "ArtAlbum{" +
                "name='" + super.getName() + '\'' +
                "pages='" + super.getPages() + '\'' +
                "quality='" + quality + '\'' +
                '}';
    }
}
