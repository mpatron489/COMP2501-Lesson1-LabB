import comp2501.lesson1.lab1b.Date;

public class Main {
    public static void main(String[] args) {
        Date d = new Date(123,123,123);
        System.out.println(d.getYyMmDd());
        d.updateYear(1234);
        System.out.println(d.getYyMmDd());
        System.out.println(d.returnYear());
        
    }
}