package model;

public class Phone {
    private String typeMessage;
    public String type;

   public Phone(String type, String typeMessage) {
        this.type = type;
        this.typeMessage = typeMessage;
    }

    public void turnOn() {
        System.out.println(String.format("%s 폰 켜지는 중 %s",typeMessage, typeMessage));
    }
}
