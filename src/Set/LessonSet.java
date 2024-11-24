package Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LessonSet {
    public static void main(String[] args) {
        Set<String> StringHashSet = new HashSet<>();
        StringHashSet.add("TangLim");
        StringHashSet.add("Khema");
        StringHashSet.add("SunHy");
        StringHashSet.add("Sarorng");
        System.out.print("[+] Insert name: ");
        String name = new Scanner(System.in).nextLine();
        StringHashSet.stream()
                        .filter(e->e.contains(name))
                        .forEach(e-> System.out.println(e));
    }
}
