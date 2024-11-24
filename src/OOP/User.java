package OOP;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Date;

public class User {
    public String id;
    public String name;
    public String gender;
    public int age;
    public LocalDate birthOfDate;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", birthOfDate=" + birthOfDate +
                '}';
    }

    public void getUserInfo(){
        System.out.println("=".repeat(20));
        System.out.println("ID:" + id);
        System.out.println("Username:" + name);
        System.out.println("Gender:" + gender);
        System.out.println("Age:" + age);
        System.out.println("Birth of Date:" + birthOfDate);
    }
}
