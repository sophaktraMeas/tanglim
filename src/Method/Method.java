package Method;

public class Method {
    static int sum(int []a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum = sum + a[i];
        }
        return sum;
    }
    static Integer max(int []s) {
        int value = s[0];
        for (int i = 0; i < s.length; i++) {
            if (value < s[i]) {
                value = s[i];
            }
        }
        return value;
    }
    static String emailValidate(String email){
        if(email.contains("@gmail.com")){
            return "Valid email";
        }
        return "Invalid email";
    }
    static Boolean compare(int a, int b){
            if (a > b) {
                return true;
            }
            return false;
        }
    public static void main(String[] args) {
        System.out.println(compare(5,9));
        System.out.println(emailValidate("Sophaktra@gmail.com"));

    }
}
