import java.util.Arrays;

public class SpiralMatrix {

    public static void main (String args[]) {
        matrix(4);
        spiral(matrix(2));
        spiral(matrix(3));
        spiral(matrix(4));
        spiral(matrix(5));
    }


    public static int[][] matrix (int size) {
        int loc = 1;
        int start = 0;
        int end = size - 1;
        int[][] mat = new int[size][size];
        while (loc <= Math.pow(size, 2)) {
            // Down
            for (int i = start; i < end; i++) {
                mat[i][start] = loc;
                loc++;
            }
            // Right
            for (int i = start; i < end; i++) {
                mat[end][i] = loc;
                loc++;
            }
            // Up
            for (int i = end; i > start; i--) {
                mat[i][end] = loc;
                loc++;
            }
            // Left
            for (int i = end; i > start; i--) {
                mat[start][i] = loc;
                loc++;
            }

            if (start == end) {
                mat[start][end] = loc;
                loc++;
            }
            
            start++;
            end--;
        }
        return mat;
    }

    public static void spiral (int[][] mat) {
        for (int i = 0; i < mat[0].length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
        System.out.println();
    }

}