// 11.Longest sub array with difference of max(ele) in the window and min(ele) is should be less than or equal to threshold value. Return Maximum Size

// Input:
//  array=[1,2,3,3,4,5],
// threshold=0,	
// Output:
//  2   #[3,3]

public class _11 {
 
    public static int longestSubarray(int[] arr, int threshold) {
        int left = 0, maxSize = 0;

        for (int right = 0; right < arr.length; right++) {
           
            int minVal = arr[left], maxVal = arr[left];
            for (int i = left; i <= right; i++) {
                minVal = Math.min(minVal, arr[i]);
                maxVal = Math.max(maxVal, arr[i]);
            }

            
            while (maxVal - minVal > threshold) {
                left++;
           
                minVal = arr[left];
                maxVal = arr[left];
                for (int i = left; i <= right; i++) {
                    minVal = Math.min(minVal, arr[i]);
                    maxVal = Math.max(maxVal, arr[i]);
                }
            }

            maxSize = Math.max(maxSize, right - left + 1);
        }

        return maxSize;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5};
        int threshold = 0;
        System.out.println(longestSubarray(arr, threshold));  
    }
}

