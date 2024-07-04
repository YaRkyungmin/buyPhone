package model;

public class Person {
    private String name;
    private Phone phone;

    public Person(String name) {
        this.name = name;
        phone = null;
    }
    @Override
    public void turnOn(Phone phone) {
        phone.turnOn();
    }

    @Override
    public void buy(UntitlePhone phone) {
        this.phone = phone;
        System.out.println(String.format("%s님이 %s을 구매했습니다.", name, this.phone.type));
    }
}
