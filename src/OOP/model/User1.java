package OOP.model;

public class User1 {
    public int id;
    public String name;
    public String email;
    public User1(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public void userInfo(){
        System.out.println("=".repeat(20));
        System.out.println("ID" + id);
        System.out.println("Name" + name);
        System.out.println("Email" + email);
    }
}
