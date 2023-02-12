class Solution {
    public int searchInsert(int[] arr, int t) {
        
   int n=arr.length;
   int i=0;
        int j=n-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==t){
                return mid;
            }
            else if(arr[mid]>t){
                 j=mid-1;
            }
            else {
               i=mid+1;
            }
            
            
        }
        return i;
    }
}
