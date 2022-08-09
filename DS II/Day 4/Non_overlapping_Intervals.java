class Solution {
    
    public int eraseOverlapIntervals(int[][] intervals) {

        int remove = 0;   
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]); 
        int[] prevInterval = intervals[0]; 

        for (int i = 1; i < intervals.length; i++) {

            int prevEnd = prevInterval[1];       
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];

            if (currStart < prevEnd) {
                if (currEnd <= prevEnd) {
                    prevInterval = intervals[i]; 
                } 

                remove++; 

            } else prevInterval = intervals[i];

        }
        return remove;

    }
}