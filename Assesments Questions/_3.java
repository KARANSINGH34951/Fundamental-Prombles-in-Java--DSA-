// 3.	Find the local maximum in a given 2D array.
public class _3 {
  public static void main(String[] args) {
    int[][] arr={{23,4,5,77},
            {4,56,7,8},
            {6,65,4,6},
            {4,9,4,7}};

  int row=arr.length;
  int col=arr[0].length;

int res=-1;
  for(int i=1;i<row-1;i++){
    for(int j=1;j<col-1;j++){
      int curr=arr[i][j];
      if(arr[i-1][j]<curr && arr[i+1][j]<curr && arr[i][j+1]<curr && arr[i][j-1]<curr){
        res=curr;
      }
    }
  }

  System.out.print(res);
  }

}
