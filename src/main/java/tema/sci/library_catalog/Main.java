package tema.sci.library_catalog;

public class Main {


    public static void main(String[] args) {


        LibraryCatalog libraryCatalog = new LibraryCatalog();

        Novel novel1 = new Novel("AdC", "100", "Romance");
        Novel novel2 = new Novel("Altceva", "424", "SF");
        Novel novel3 = new Novel("Ceva", "214", "Fiction");
        Novel novel4 = new Novel("AsdaasddC", "568", "Romance");
        Novel novel5 = new Novel("Alasdastceva", "35", "SF");
        Novel novel6 = new Novel("Cesadasdva", "332", "Fiction");
        ArtAlbum artAlbum1 = new ArtAlbum("Adsa", "123", "Bad");
        ArtAlbum artAlbum2 = new ArtAlbum("AltcevaCeva", "200", "Good");
        ArtAlbum artAlbum3 = new ArtAlbum("CevaCeva", "554", "Excellent");
        ArtAlbum artAlbum4 = new ArtAlbum("Adssadaa", "35", "Bad");
        ArtAlbum artAlbum5 = new ArtAlbum("AltcasdadevaCeva", "12", "Good");
        ArtAlbum artAlbum6 = new ArtAlbum("CevasdsadasdaCeva", "11", "Excellent");


        libraryCatalog.addBook(novel1);
        libraryCatalog.addBook(novel2);
        libraryCatalog.addBook(novel3);
        libraryCatalog.addBook(novel4);
        libraryCatalog.addBook(novel5);
        libraryCatalog.addBook(novel6);
        libraryCatalog.addBook(artAlbum1);
        libraryCatalog.addBook(artAlbum2);
        libraryCatalog.addBook(artAlbum3);
        libraryCatalog.addBook(artAlbum4);
        libraryCatalog.addBook(artAlbum5);
        libraryCatalog.addBook(artAlbum6);

        libraryCatalog.deleteBook(novel5);

        System.out.println(libraryCatalog.listAllBooks());
        System.out.println(libraryCatalog.getItemsByCriteria("SF"));
        System.out.println(libraryCatalog.getItemsByCriteria("Good"));

        libraryCatalog.deleteBook(artAlbum2);

        System.out.println(libraryCatalog.listAllBooks());
        System.out.println(libraryCatalog.getItemsByCriteria("Good"));

        System.out.println(libraryCatalog.listAllBooks());

    }
}
