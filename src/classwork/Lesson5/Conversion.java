package classwork.Lesson5;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println(" preobrazovanie tipa int v tip byte ");

        b = (byte) i;

        System.out.println(" i u b " + i + " " + b);

        System.out.println(" preobrazovanie tipa double tipa int ");
        i = (int) d;

        System.out.println(" d u i " + d + " " + i);

        System.out.println("preobrazovanie tipa double  v tip byte ");
        b = (byte) d;


    }

}
