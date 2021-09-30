package tema.sci.oop_homework.phone;

public interface Messages {

    String message = "";

    default boolean checkLength() {
        if (message.length() > 500){
            System.out.println("This message is to big");
            return false;
        }
        return true;
    }

}
