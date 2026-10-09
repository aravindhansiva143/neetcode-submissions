class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int rig=heights.length-1;
        int res=0;
        while(left<rig){
            int a=Math.min(heights[left],heights[rig])*(rig-left);
            res=Math.max(res,a);
            if(heights[left]<=heights[rig]){
                left++;
            }else{
                rig--;
            }
        }
        return res;
    }
}
