package OOP.model;

public class User2 {
    private Integer id;
    private String userName;
    private String email;
    private String password;

    public static void setName(String name) {
    }

    public void setId(Integer id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setUserName(String name){
        this.userName = name;
    }
    public String getUserName(){
        return userName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
}
