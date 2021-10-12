package tema.sci.library_catalog;

import java.util.LinkedList;
import java.util.List;

public class ArtAlbum {

    private String name;
    private String pages;
    private String quality;

    private List<ArtAlbum> badQualityAlbumList = new LinkedList<>();
    private List<ArtAlbum> goodQualityAlbumList = new LinkedList<>();
    private List<ArtAlbum> excellentQualityAlbumList = new LinkedList<>();
    private List<ArtAlbum> undefinedQualityAlbumList = new LinkedList<>();




    public void addInListByQuality(String quality){
        if(quality == "bad"){
            badQualityAlbumList.add( this);
        } else if (quality == "good"){
            goodQualityAlbumList.add(this);
        }else if (quality == "excellent"){
            excellentQualityAlbumList.add(this);
        }else {
            undefinedQualityAlbumList.add(this);
        }
    }

    public ArtAlbum(String name, String pages, String quality) {
        this.name = name;
        this.pages = pages;
        this.quality = quality;
        addInListByQuality(quality);
    }



}
