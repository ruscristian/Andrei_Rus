package tema.sci.library_catalog;

import java.util.LinkedList;
import java.util.List;

public class Novel {

    private String name;
    private String pages;
    private String genre;

    private List<Novel> sfGenreList = new LinkedList<>();
    private List<Novel> mysteryGenreList = new LinkedList<>();
    private List<Novel> romanceGenreList = new LinkedList<>();
    private List<Novel> undefinedGenreList = new LinkedList<>();




    public void addInListByGenre(String genre){
        if(this.genre == "sf"){
            sfGenreList.add( this);
        } else if (this.genre == "mystery"){
            mysteryGenreList.add(this);
        }else if (this.genre == "romance"){
            romanceGenreList.add(this);
        }else {
            undefinedGenreList.add(this);
        }
    }

    public Novel(String name, String pages, String genre) {
        this.name = name;
        this.pages = pages;
        this.genre = genre;
        addInListByGenre(this.genre);
    }

}
