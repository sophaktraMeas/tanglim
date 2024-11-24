package Method;

import java.util.Arrays;

public class MethodLesson1 {
    static String [] nameChecker(String [] names){
        String [] result = new String[names.length];
        for(int i=0;i<names.length;i++){
            if(names[i].startsWith("K") || names[i].startsWith("k")){
                result[i] = names[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String[] names = {"Kimhout","koko","Tingei"};
        System.out.println(Arrays.toString(nameChecker(names)));
    }
}
