class Solution {
    public int maxArea(int[] height) {
    int l =0, r = height.length-1,maxArea=0,area;
        while(l<r){
            area = Math.min(height[l],height[r]) * (r-l);

            maxArea = Math.max(area,maxArea);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxArea;
    }
}
