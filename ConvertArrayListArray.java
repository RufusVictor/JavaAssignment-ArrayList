import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayListArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        String[] array = list.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(array));

        ArrayList<String> newList = new ArrayList<>(Arrays.asList(array));
        System.out.println("ArrayList: " + newList);
    }
}
