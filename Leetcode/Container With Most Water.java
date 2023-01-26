class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length -1;
        int maxar = 0;
        for(int i = 0; i< height.length -1; i++){
            int m = (r-l) * Math.min(height[l] , height[r]);
            if(m> maxar){
                maxar = m;
            }
            if( height[l] < height[r]){
                l = l +1;
            }
            else{
                r = r -1;
            }
        }
        return maxar;
    }
}
