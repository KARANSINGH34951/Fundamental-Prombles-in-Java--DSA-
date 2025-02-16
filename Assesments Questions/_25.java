// 25.Count the elements that contain at least two occurrences of the digit 7 in the array 
// and are divisible by 3. 
// Input : 
// arr = [77, 171, 273, 774, 717, 777, 147, 770] 
// Output : 
// 3
public class _25 {

    public static void main(String[] args) {
        int[] arr = {77, 171, 273, 774, 717, 777, 147, 770};
        int count = countnum(arr);
        System.out.println(count); 
    }

    public static int countnum(int[] arr) {
        int count = 0;
        for (int num : arr) {
            
            if (num % 3 == 0) {
                
                if (count7(num) >= 2) {
                    count++;
                }
            }
        }
        return count;
    }


    private static int count7(int num) {
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
