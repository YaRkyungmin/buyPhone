package model;

public class Phone {
    private String typeMessage;
    private String type;

   Phone(String type, String typeMessage) {
        this.type = type;
        this.typeMessage = typeMessage;
    }
    @Override
    public void turnOn() {
        System.out.println(String.format("%s 폰 켜지는 중 %s",typeMessage, typeMessage));
    }
}
