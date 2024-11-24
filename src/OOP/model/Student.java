package OOP.model;

import javax.crypto.spec.PSource;
import java.time.LocalDate;

public class Student {
    public String id;
    public String name;
    public String gender;
    public int age;
    public LocalDate birthOfDate;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + birthOfDate +
                '}';
    }
    public void getUserInfo(){
        System.out.println("=".repeat(20));
        System.out.println("ID:" + id);
        System.out.println("StudentName:" + name);
        System.out.println("Gender:" + gender);
        System.out.println("Age:" + age);
        System.out.println("dateOfBirth:" + birthOfDate);
    }



}
