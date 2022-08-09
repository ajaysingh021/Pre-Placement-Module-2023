class Solution {
public int search(int[] a, int target) {
int start=0;
int end=a.length-1;

    while(start<=end)
    {
        int mid=start+(end-start)/2;
    
        if(a[mid]==target)
            return mid;
      
        if(a[start]<=a[mid])
        {
            if(target<=a[mid] && target>=a[start])
                end=mid-1;
            else
                start=mid+1;
        }
        
        if(a[mid]<=a[end])
        {
            if(target>=a[mid] && target<=a[end])
                start=mid+1;
            else
                end=mid-1;
        }
     }
    return -1;
}
}