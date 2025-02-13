// 8.Given a string, needed to find the substring of length 3 whose first and last character are same, return the count
// input:”abcxccc’
// output:2
public class _8 {

  public static void main(String[] args) {
    String str="abcxccc";
    int k=3;

    int count=0;

    for(int i=0;i<str.length()-k+1;i++){
        
          if(str.charAt(i)==str.charAt(i+k-1)){
              count+=1;
          }
        
    }

    System.out.println(count);
  }
  
}
