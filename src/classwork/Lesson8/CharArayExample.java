package classwork.Lesson8;

public class CharArayExample {

    public static void main(String[] args) {
        int a = 0;
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a')
                a++;

        }

        System.out.println(a);

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        int b = chars2.length / 2;
        int z = b - 1;
        System.out.println(chars2[z] + "" + chars2[b]);


        boolean b1;
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y' };

        if (chars3[chars3.length - 2] == 'l' && chars3[chars3.length - 1] == 'y') {
            b1 = true;


        } else b1 = false;

        System.out.println(b1);


        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a' };
        char c1 = 'b';
        boolean b2 = false;
        for (int i = 0; i < bobArray.length - 2; i++) {

            if (bobArray[i] == c1 && bobArray[i + 2] == c1) {
                b2 = true;

            }
        }
        System.out.println(b2);

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ' };

        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' '){
                System.out.print(text[i]);
            }


        }

    }


}






