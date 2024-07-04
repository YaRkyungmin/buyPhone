package model;

public class Phone implements Phonable {
    private String typeMessage;
    private String type;

   public Phone(String type, String typeMessage) {
        this.type = type;
        this.typeMessage = typeMessage;
    }

    public void turnOn() {
        System.out.println(String.format("%s 폰 켜지는 중 %s",typeMessage, typeMessage));
    }

    public String getType() {
        return type;
    }
}
