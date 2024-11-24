package collectionFrameWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamAPILearning{
    public static void main(String[] args) {
        List<String> studentNames = new ArrayList<>(
                List.of("Kimhout", "Tangei", " Somnang")
        );
        System.out.print("[+] Insert name to search: ");
        String names = new Scanner(System.in).nextLine();
        studentNames.stream()
                .filter(e->e.equalsIgnoreCase(names))
                .forEach(e-> System.out.println(e));
    }
}
