import java.util.Arrays;

public class FourNineEight {
    public static void main(String[] args) {
        int[][] twoD = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = twoD.length;
        int n = 3;
        int[] oneD = new int[m * n];
        int z = 0;

        oneD[z] = twoD[0][0];
        z++;
        oneD[z] = twoD[0][1];
        z++;
        oneD[z] = twoD[1][0];
        z++;
        oneD[z] = twoD[2][0];
        z++;
        oneD[z] = twoD[1][1];
        z++;
        oneD[z] = twoD[0][2];
        z++;
        oneD[z] = twoD[1][2];
        z++;
        oneD[z] = twoD[2][1];
        z++;
        oneD[z] = twoD[2][2];
        
        System.out.println(Arrays.toString(oneD));
    }
}