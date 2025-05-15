import java.util.ArrayList;

public class CharacterSearch {
    public static int findIndex(ArrayList<Character> list, char target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('D');
        chars.add('E');
        chars.add('F');
        chars.add('G');
        chars.add('H');
        chars.add('I');
        chars.add('J');

        char searchChar = 'E';
        int index = findIndex(chars, searchChar);
        System.out.println("Index of '" + searchChar + "': " + index);
    }
}
