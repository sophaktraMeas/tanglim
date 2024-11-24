package Array.Array2;

import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        for(int i=0; i<numbers.length; i++ ){
            System.out.print("[+] insret numbers[" + i +"]:");
            numbers[i] = new Scanner(System.in).nextInt();
        }
        for(int i=0; i<numbers.length; i++ ){
            if(numbers[i]%2==0);
            System.out.println(numbers[i]);


        }
    }
}
