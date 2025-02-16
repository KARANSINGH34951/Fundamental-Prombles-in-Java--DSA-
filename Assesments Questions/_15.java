// 15.Given an Array arr[] with n numbers and return it in given Order For Example :
// Input: arr[]={1, 2, 3, 4, 5, 6, 7};
// Output: arr[]={1, 7, 2, 6, 3, 5, 4};
import java.util.Arrays;
public class _15 {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] result = rearrangeArray(arr);
        System.out.println(Arrays.toString(result)); 
    }

    public static int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int left = 0; 
        int right = n - 1; 
        int index = 0; 

      
        while (left <= right) {
            if (left == right) {
                
                result[index] = arr[left];
            } else {
                
                result[index] = arr[left];
                index++;
                
                result[index] = arr[right];
            }
            left++;
            right--;
            index++;
        }

        return result;
    }

}
