package Method;

import java.time.LocalDate;
import java.util.Arrays;

public class MethodLesson {
    static void sort(int []a){
        Arrays.sort(a);
    }
    static Double currencyCheck(){
        LocalDate localDate = LocalDate.of(2025,5,6);
        LocalDate now = LocalDate.now();
        if(localDate.isAfter(now)){
            return 4400.00;
        }
        return 4000.00;
    }
    public static void main(String[] args) {
        System.out.println(currencyCheck());
    }
}
