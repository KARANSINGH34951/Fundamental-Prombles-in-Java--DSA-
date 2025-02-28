// 28.Question: Given an array of integers, reduce each element to a single-digit number by 
// summing its digits repeatedly until a single digit is obtained. Then, find and print the 
// most frequently occurring unique single-digit number. If there is a tie, print the smallest 
// one. 
// Input: 
// arr = [38, 19, 77, 56, 45, 92, 100] 
// Output : 
// 2
import java.util.HashMap;
import java.util.Map;

public class _28 {
   
    private static int getSingleDigit(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    private static int findMostFrequentDigit(int[] numbers) {
        Map<Integer, Integer> digitFrequency = new HashMap<>();
        
        for (int num : numbers) {
            int singleDigit = getSingleDigit(num);
            digitFrequency.put(singleDigit, digitFrequency.getOrDefault(singleDigit, 0) + 1);
        }
        
        int maxCount = 0;
        int result = 9; 
        
        for (Map.Entry<Integer, Integer> entry : digitFrequency.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value > maxCount || (value == maxCount && key < result)) {
                maxCount = value;
                result = key;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {38, 19, 77, 56, 45, 92, 100};
        System.out.println(findMostFrequentDigit(numbers));
    }
}
