import java.util.ArrayList;

import java.util..*;;
public class _21 {

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
        };
        int k = 3;
        int sum = spiralSum(mat, k);
        System.out.println(sum); 
    }

    public static int spiralSum(int[][] mat, int k) {
        ArrayList<Integer> spiral = new ArrayList<>();
        int top = 0, bottom = mat.length - 1;
        int left = 0, right = mat[0].length - 1;

        while (top <= bottom && left <= right) {
           
            for (int i = left; i <= right; i++) {
                spiral.add(mat[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                spiral.add(mat[i][right]);
            }
            right--;

           
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiral.add(mat[bottom][i]);
                }
                bottom--;
            }

           
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiral.add(mat[i][left]);
                }
                left++;
            }
        }

       
        int sum = 0;
        for (int i = 0; i < spiral.size(); i++) {
            if (i % k == 0) {
                sum += spiral.get(i);
            }
        }

        return sum;
    }
}


