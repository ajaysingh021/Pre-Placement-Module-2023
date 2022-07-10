class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    public static void reverse(int[] a,int s,int e){
        int li=s;
        int ri=e;
        while(li<ri){
            int temp=a[ri];
            a[ri]=a[li];
            a[li]=temp;
            li++;
            ri--;
        }
    }
}