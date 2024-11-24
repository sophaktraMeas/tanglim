package OOP.model;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.id = 11;
        teacher.name = "Ty Ty Love";
        teacher.age = 18;
        System.out.println(teacher);
        teacher.getName();
        teacher.getId();

    }
}
