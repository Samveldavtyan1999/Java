package classwork.Lesson8;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30,};

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

        }
        System.out.println();
        int l = array[0];
        for (int i = 0; i <array.length ; i++) {
            if (l< array[i]){
                l = array[i];
            }
        }
        System.out.println(l);
        int o = array[0];
        for (int i = 0; i <array.length; i++){
            if (o > array[i]){
                o = array[i];
            }
        }
        System.out.println(o);

        int a = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
                a = a + 1;
            }

        }
        System.out.println();
        int b = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
                b = b + 1;
            }

        }
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        int d = 0;
        double c = 0;
        for (int i = 0; i < array.length; i++) {
            c = c + array[i];
            d = d + array[i];
        }
        System.out.println(c / array.length);
        System.out.println(d);


    }

}

