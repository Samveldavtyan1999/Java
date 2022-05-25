package classwork.Lesson9;

public class ArraySpaceExamplee {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int first = 0;
        int last = spaceArray.length - 1;
        while (first < spaceArray.length && spaceArray[first] == ' ') {
            first++;
        }
        while (last < spaceArray.length && spaceArray[last] == ' ') {
            last--;
        }

        int s = 0;
        char[] result = new char[last];
        for (int i = first; i <= last; i++) {
            result[s] = spaceArray[i];
            System.out.print(result[s]);
            s++;
        }
    }


}
