class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        if(left == 0 || right == 0 || left > Integer.MAX_VALUE || right > Integer.MAX_VALUE) return 0;
        while(left < right){
            right = right & (right - 1); 
        }
        return left & right;
    }
}
