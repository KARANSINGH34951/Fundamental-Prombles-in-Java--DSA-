// 6.Problem Statement: Given a list of integers, count the number of unique pairs (i, j) where the numbers differ by exactly one digit. Two numbers are considered to differ by one digit if they have the same number of digits, and all digits are identical except for one position.
// Example:
// Input:
// [1, 151, 241, 1, 9, 22, 351]
// Output:3

public class _6 {

    public static boolean diffdigits(int num1, int num2) {
        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);

        if (str1.length() != str2.length()) {
            return false; 
        }

        int diffCount = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                diffCount++;
                if (diffCount > 1) {
                    return false; 
                }
            }
        }
        return diffCount == 1;
    }

   
    public static int countuniuqpairs(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { 
                if (diffdigits(arr[i], arr[j])) {
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] arr = {1, 151, 241, 1, 9, 22, 351};
        System.out.println(countuniuqpairs(arr)); 
    }
}

