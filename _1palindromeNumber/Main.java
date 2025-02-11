import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a Number: ");
    int n=sc.nextInt();
    int copy=n;
    int ans=0;
    while(n>0){
      int rem=n%10;
      ans=(ans*10)+rem;
      n=n/10;
    }

    if(copy==ans){
      System.out.println("Palindrome");
    }else{
      System.out.println("Not a palindrome");
    }

    }
}
