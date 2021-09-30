package tema.sci.array;

public class Main {

    public static void main(String[] args) {

        String[] myArray = {"I ", "am ", "learning ", "java", "."};
        String mySentence = "";
        for (String s : myArray) {
            mySentence += s;
        }
        System.out.println(mySentence);
    }
}
