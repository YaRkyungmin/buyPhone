import model.Person;
import model.Phone;

public class Main {
    public static void main(String[] args) {
        Person jobs = new Person("jobs");
        Person jaeyoung = new Person("jaeyoung");

        Phone iPhone = new Phone("애플","@@@");
        Phone samsungPhone = new Phone("삼송", "***");

        jobs.buy(iPhone);
        jaeyoung.buy(samsungPhone);

        jobs.turnOn();
        jaeyoung.turnOn();
    }
}
