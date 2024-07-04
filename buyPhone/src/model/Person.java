package model;

public class Person {
    private String name;
    private Phone phone;

    public Person(String name) {
        this.name = name;
        phone = null;
    }

    public void turnOn() {
        System.out.println(String.format("%s님이 %s폰을 켰습니다.", name, phone.type));
        phone.turnOn();
    }

    public void buy(Phone phone) {
        this.phone = phone;
        System.out.println(String.format("%s님이 %s폰을 구매했습니다.", name, phone.type));
    }
}
