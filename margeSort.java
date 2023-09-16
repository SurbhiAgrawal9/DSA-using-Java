// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    //marge  divide and conquer
    public static void divide(int arr[], int st, int ed ){
        if(st >= ed){
            return ;
        }
        int mid = st + (ed - st) /2; 
        divide(arr,st,mid);
        divide(arr,mid+1,ed);
        conquer(arr,st,mid,ed);
    }
    
    public static void conquer(int arr[], int st, int mid, int ed){
        int merger[] = new int[ed -st + 1]; //n-1
        int idx1 = st;
        int idx2 = mid + 1;
        int x = 0;
        while(idx1<=mid && idx2 <=ed){
            if(arr[idx1] <= arr[idx2]){
                merger[x] = arr[idx1];
                x++;
                idx1++;
            } 
            else {
                merger[x] = arr[idx2];
                x++;
                idx2++;
                // short merger[x++] = arr[idx2++];
            }
        }
          while(idx1 <= mid){
              merger[x] = arr[idx1];
              x++;
              idx1++;
            //   short merger[x++] = arr[idx1++];
          } 
          while(idx2 <= ed){
              merger[x] = arr[idx2];
              x++;
              idx2++;
          }
          for(int i=0, j=st;i<merger.length; i++,j++){
              arr[j] = merger[i];
          }
    }
    
    
    
    
    
    public static void main(String[] args) {
      int arr[] = {6,3,9,5,2,5};
      int n = arr.length;
      
      
      divide(arr,0,n-1);
      for(int i=0;i<n;i++){
          System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
}











