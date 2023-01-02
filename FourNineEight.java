import java.util.Arrays;

public class FourNineEight {
    public static void main(String[] args) {
        // (Many other cases exist, this is just a sampling to try and detect a pattern)
        // Case 1
        // int[][] twoD = {{1}};
        // int n = 1;

        // Case 2
        // int[][] twoD = {{1}, {2}};
        // int n = 1;

        // Case 3
        // int[][] twoD = {{1}, {2}, {3}};
        // int n = 1;
        
        // Case 4
        // int[][] twoD = {{1, 2}};
        // int n = 2;

        // Case 5
        // int[][] twoD = {{1, 2}, {3, 4}};
        // int n = 2;

        // Case 6
        // int[][] twoD = {{1, 2}, {3, 4}, {5, 6}};
        // int n = 2;

        // Case 7
        // int[][] twoD = {{1, 2, 3}};
        // int n = 3;

        // Case 8
        // int[][] twoD = {{1, 2, 3}, {4, 5, 6}};
        // int n = 3;
        
        // Case 9
        int[][] twoD = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = 3;

        // Case 10
        // int[][] twoD = {{1, 2, 3, 4}};
        // int n = 4;

        // Case 11
        // int[][] twoD = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        // int n = 4;

        // Case 12
        // int[][] twoD = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        // int n = 4;


        int m = twoD.length;
        int totalItems = m * n;
        int[] oneD = new int[totalItems];
        int currentI = 0;
        int currentJ = 0;
        int z = 0;


        // Case 1
        // oneD[z] = twoD[0][0];
        /*
        * |1|
        */
        // Output: [1]

        // Case 2
        // oneD[z] = twoD[0][0];
        // z++;
        // oneD[z] = twoD[1][0];
        /*
        * |1|
        * |2|
        */
        // Output: [1, 2]
        
        // Case 3
        // oneD[z] = twoD[0][0];
        // z++;
        // oneD[z] = twoD[1][0];
        // z++;
        // oneD[z] = twoD[2][0];
        /*
        * |1|
        * |2|
        * |3|
        */
        // Output: [1, 2, 3]

        // Case 4
        // oneD[z] = twoD[0][0];
        // z++;
        // oneD[z] = twoD[0][1];
        /*
        * |1|2|
        */
        // Output: [1, 2]

        // Case 5
        // oneD[z] = twoD[0][0];
        // z++;
        // oneD[z] = twoD[0][1];
        // z++;
        // oneD[z] = twoD[1][0];
        // z++;
        // oneD[z] = twoD[1][1];
        /*
        * |1|2|
        * |3|4|
        */
        // Output: [1, 2, 3, 4]

        // Case 6
        // oneD[z] = twoD[0][0];
        // z++;
        // oneD[z] = twoD[0][1];
        // z++;
        // oneD[z] = twoD[1][0];
        // z++;
        // oneD[z] = twoD[2][0];
        // z++;
        // oneD[z] = twoD[1][1];
        // z++;
        // oneD[z] = twoD[2][1];
        /*
        * |1|2|
        * |3|4|
        * |5|6|
        */
        // Output: [1, 2, 3, 5, 4, 6]

        // Case 7
        // oneD[z] = twoD[0][0];
        // z++;
        // oneD[z] = twoD[0][1];
        // z++;
        // oneD[z] = twoD[0][2];
        /*
        * |1|2|3|
        */
        // Output: [1, 2, 3]

        // Case 8
        // oneD[z] = twoD[0][0];
        // z++;
        // oneD[z] = twoD[0][1];
        // z++;
        // oneD[z] = twoD[1][0];
        // z++;
        // oneD[z] = twoD[1][1];
        // z++;
        // oneD[z] = twoD[0][2];
        // z++;
        // oneD[z] = twoD[1][2];
        /*
        * |1|2|3|
        * |4|5|6|
        */
        // Output: [1, 2, 4, 5, 3, 6]
        
        // Case 9
        // oneD[z] = twoD[0][0];
        // z++;
        // oneD[z] = twoD[0][1];
        // z++;
        // oneD[z] = twoD[1][0];
        // z++;
        // oneD[z] = twoD[2][0];
        // z++;
        // oneD[z] = twoD[1][1];
        // z++;
        // oneD[z] = twoD[0][2];
        // z++;
        // oneD[z] = twoD[1][2];
        // z++;
        // oneD[z] = twoD[2][1];
        // z++;
        // oneD[z] = twoD[2][2];
        /*
        * |1|2|3|
        * |4|5|6|
        * |7|8|9|
        */
        // Output: [1, 2, 4, 7, 5, 3, 6, 8, 9]


        while(totalItems > totalItems - 1) {
            oneD[z] = twoD[currentI][currentJ];
            totalItems--;
        }










        // Case 10
        // oneD[z] = twoD[0][0];
        // z++;
        // oneD[z] = twoD[0][1];
        // z++;
        // oneD[z] = twoD[0][2];
        // z++;
        // oneD[z] = twoD[0][3];
        /*
        * |1|2|3|4|
        */
        // Output: [1, 2, 3, 4]

        // Case 11
        // oneD[z] = twoD[0][0];
        // z++;
        // oneD[z] = twoD[0][1];
        // z++;
        // oneD[z] = twoD[1][0];
        // z++;
        // oneD[z] = twoD[1][1];
        // z++;
        // oneD[z] = twoD[0][2];
        // z++;
        // oneD[z] = twoD[0][3];
        // z++;
        // oneD[z] = twoD[1][2];
        // z++;
        // oneD[z] = twoD[1][3];
        /*
        * |1|2|3|4|
        * |5|6|7|8|
        */
        // Output: [1, 2, 5, 6, 3, 4, 7, 8]

        // Case 12
        // oneD[z] = twoD[0][0];
        // z++;
        // oneD[z] = twoD[0][1];
        // z++;
        // oneD[z] = twoD[1][0];
        // z++;
        // oneD[z] = twoD[2][0];
        // z++;
        // oneD[z] = twoD[1][1];
        // z++;
        // oneD[z] = twoD[0][2];
        // z++;
        // oneD[z] = twoD[0][3];
        // z++;
        // oneD[z] = twoD[1][2];
        // z++;
        // oneD[z] = twoD[2][1];
        // z++;
        // oneD[z] = twoD[2][2];
        // z++;
        // oneD[z] = twoD[1][3];
        // z++;
        // oneD[z] = twoD[2][3];
        /*
        *  |1|2 |3 |4 |
        *  |5|6 |7 |8 |
        *  |9|10|11|12|
        */
        // Output: [1, 2, 5, 9, 6, 3, 4, 7, 10, 11, 8, 12]


        System.out.println(Arrays.toString(oneD));
    }
}