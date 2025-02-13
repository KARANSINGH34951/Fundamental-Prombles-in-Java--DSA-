// 9.Find number of triplets in string with same first and last character.

public class _9 {
  public static void main(String[] args) {
    String str="aaabbbcccertbbb";

    int increament=0;
    int count=0;

    while(increament<str.length()-2){
      if(str.charAt(increament)==str.charAt(increament+1)&& str.charAt(increament)==str.charAt(increament+2)){
        count++;
      }
      increament++;
    }

    System.out.println(count);
  }
  
}
