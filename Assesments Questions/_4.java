
// 4.	Return the number of beautiful pairs.
public class _4 {
 public static void main(String[] args) {
  int arr1[]={2,3,4,5,6};
  int arr2[]={2,3,4,7,8};
  int i=0;
  int j=0;

  int count=0;

  while(i<arr1.length && j<arr2.length){
      if(arr1[i]==arr2[j]){
          count++;
          i++;
          j++;
      }else if(arr1[i]<arr2[j]){
        i++;
      }else{
        j++;
      }

      
    }
    int modify=count<arr1.length? count+1:count-1;
    System.out.println(modify);
  }
 }

  

