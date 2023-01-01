import java.util.Arrays;

public class FourNineEight {
    public static void main(String[] args) {
        int[][] twoD = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = twoD.length;
        int n = 3;
        int[] oneD = new int[m * n];
        int z = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                oneD[z] = twoD[i][j];
                z++;
            }
        }
        
        System.out.println(Arrays.toString(oneD));
    }
}