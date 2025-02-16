public class _24 {
 
    public static void main(String[] args) {
        int[] arr = {77, 123, 777, 63, 147, 717, 21};
        int count = countValidNumbers(arr);
        System.out.println(count); 
    }

    public static int countValidNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            
            if (num % 3 == 0) {
                
                if (countDigitSeven(num) >= 2) {
                    count++;
                }
            }
        }
        return count;
    }

    
    private static int countDigitSeven(int num) {
        String str = Integer.toString(num);
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '7') {
                count++;
            }
        }
        return count;
    }

  
}
