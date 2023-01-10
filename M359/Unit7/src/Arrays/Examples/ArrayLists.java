package Arrays.Examples;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Andrew");
        names.add("Ben");
        names.add("Colin");
        names.add("Denna");
        System.out.println(names);
        names.add(1, "Amy");
        System.out.println(names);
        System.out.println(names.remove(2));
        System.out.println(names);
        names.set(3, "Mrs.Denna");
        System.out.println(names);
        names.add(names.remove(2));
        System.out.println(names);
    }
}
