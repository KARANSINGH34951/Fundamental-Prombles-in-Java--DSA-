// 27.Question: Write a program that takes a three character string as input and checks if the 
// first and last characters are the same, ignoring case. 
// Input: 
// Axa 
// Output: 
// 1

import java.util.Scanner;
public class _27 {
 

  public class Main {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          String str = scanner.next();
          scanner.close();
  
          if (str.length() == 3 && Character.toLowerCase(str.charAt(0)) == Character.toLowerCase(str.charAt(2))) {
              System.out.println(1);
          } else {
              System.out.println(0);
          }
      }
  }
   
}
