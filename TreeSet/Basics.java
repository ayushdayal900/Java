package TreeSet;

import java.util.TreeSet;

public class Basics {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Mumbai");
        ts.add("Nagpur");
        ts.add("Bhopal");
        ts.add("America");
        ts.add("Zimbamway");

        System.out.println(ts);
    }
}
