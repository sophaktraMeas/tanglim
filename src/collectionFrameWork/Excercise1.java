package collectionFrameWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        List<Integer> studentAges = new ArrayList<>(
                List.of(12,14,29,34)
        );
        System.out.print("[+] Insert age to search: ");
        int age = new Scanner(System.in).nextInt();
        studentAges.stream()
                .filter(e->e>18)
                .forEach(e-> System.out.println(e));
    }
}
