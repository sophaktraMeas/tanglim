package Array.Array2;

public class Array2D {
    public static void main(String[] args) {
        int [][] numbers = new int[2][3];
        numbers[0][0] = 12;
        numbers[0][1] = 13;
        numbers[1][2] = 14;
        for(int i=0;i<numbers.length;i++) {
            for (int j = 0; j< numbers[0].length; j++) {
                System.out.print(numbers[i][j] + " I ");
            }
            System.out.println();
        }

    }
}
