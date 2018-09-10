import java.util.Arrays;

public class SumofRows {

    public static void main(String[] args) {
        int[][] arr = {{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}};
        System.out.println("Total row: " + Arrays.toString(totalRow(arr)));
    }

    public static int[] totalRow(int[][] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int v : arr[i]) {
                sum += v;
            }
            newArr[i] = sum;
        }
        return newArr;
    }

}
