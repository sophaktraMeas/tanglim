package OOP.model;

import OOP.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LearnOOPDay2 {
    public static void main(String[] args){
        Student student1 = new Student();
        System.out.println("[+] Enter your name:");
        String name = new Scanner(System.in).nextLine();
        System.out.println("[+] Enter your ID: ");
        String ID = new Scanner(System.in).nextLine();
        System.out.println("[+] Enter your age:");
        int age = new Scanner(System.in).nextInt();
        System.out.println("[+] Enter your birthOfDate:");
        System.out.println("[+] Insert in year:");
        int y = new Scanner(System.in).nextInt();
        System.out.println("[+] Insert in month:");
        int month = new Scanner(System.in).nextInt();
        System.out.println("[+] Insert in dayOfMonth:");
        int dayOfMonth = new Scanner(System.in).nextInt();


        Student student2 = new Student();
        System.out.println("[+] Enter your name of student2:");
        String names = new Scanner(System.in).nextLine();
        System.out.println("[+] Enter your ID: ");
        String IDs = new Scanner(System.in).nextLine();
        System.out.println("[+] Enter your age:");
        int ages = new Scanner(System.in).nextInt();
        System.out.println("[+] Enter your birthOfDate:");
        System.out.println("[+] Insert in year:");
        int year = new Scanner(System.in).nextInt();
        System.out.println("[+] Insert in month:");
        int months = new Scanner(System.in).nextInt();
        System.out.println("[+] Insert in dayOfMonth:");
        int dayOfMonths = new Scanner(System.in).nextInt();
        


        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        System.out.println(students);

        System.out.println("=".repeat(20));
        System.out.println("Input ID to delete:");
        String idToDelete = new Scanner(System.in).nextLine();
        for(Student s: students){
            if(idToDelete.equals(s.id)){
                students.remove(student1);
                break;

            }
        }

    }
}
