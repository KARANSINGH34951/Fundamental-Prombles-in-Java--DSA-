public class _22 {
  
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
        };
        int k = 3;
        int sum = spiralsfunc(mat, k);
        System.out.println(sum); 
    }

    public static int spiralsfunc(int[][] mat, int k) {
        int sum = 0;
        int idx = 0; 
        int top = 0, bottom = mat.length - 1;
        int left = 0, right = mat[0].length - 1;

        while (top <= bottom && left <= right) {
          
            for (int i = left; i <= right; i++) {
                if (idx % k == 0) {
                    sum += mat[top][i];
                }
                idx++;
            }
            top++;

           
            for (int i = top; i <= bottom; i++) {
                if (idx % k == 0) {
                    sum += mat[i][right];
                }
                idx++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    if (idx % k == 0) {
                        sum += mat[bottom][i];
                    }
                    idx++;
                }
                bottom--;
            }

           
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    if (idx % k == 0) {
                        sum += mat[i][left];
                    }
                    idx++;
                }
                left++;
            }
        }

        return sum;
    }

}
