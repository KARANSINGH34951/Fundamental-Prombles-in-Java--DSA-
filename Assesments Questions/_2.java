// 2.	Given an array num, check if a number is a palindromic number and return the array of such numbers in decreasing order.

import java.util.ArrayList;
import java.util.Collections;

public class _2 {

  public static boolean ispalindrome(int value){
    int n=value;
    int res=0;
    while(n!=0){
        int rem=n%10;
        res=(res*10)+rem;
        n=n/10; 
    }
    if(res==value){
      return true;
    }else{
      return false;
    }
  }
  
  public static void main(String[] args) {
    int[] arr={2,3,4,5,141,345,675,676};
  
    ArrayList<Integer> res=new ArrayList<Integer>();
    for(int i=0;i<arr.length;i++){
      if(ispalindrome(arr[i])){
          res.add(arr[i]);
      }
    }
    Collections.sort(res);
    Collections.reverse(res);
    System.out.println(res);
  }

}

