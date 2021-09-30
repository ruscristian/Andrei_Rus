package tema.sci.oop_homework.phone;

public interface Messages {

    String message = "";

    default boolean checkLength() {
        if (this.message.length() > 500){
            System.out.println("This message is to long");
            return false;
        }
        return true;
    }

}
