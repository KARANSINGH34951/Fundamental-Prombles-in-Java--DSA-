// 1.	Return the count of numbers that are not equal to a[0] and a[1] in the given array or Given an array of integers, count the number of elements that are not equal to the first two elements of the array. If the number of elements in the array is less than 2, then print 0.
public class _1 {
  public static void main(String[] args) {
    int[] arr = { 2, 5, 6, 8, 9, 7, 45, 23, 78 };
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr.length < 2) {
        System.out.println(0);
        break;
      }

      if (arr[0] != arr[i] && arr[1] != arr[i]) {

        count++;
      }
    }

    System.out.println(count);
  }
}