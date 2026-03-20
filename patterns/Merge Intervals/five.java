// GFG Problem : https://www.geeksforgeeks.org/problems/attend-all-meetings-ii/1

import java.util.Arrays;

class PMergeIntervalsFive {
        public int minMeetingRooms(int[] start, int[] end) { 
        Arrays.sort(start);
        Arrays.sort(end);
        int n = start.length;
        int i = 0;
        int j = 0;
        int rooms = 0;
        int maxrooms = 0;
        while(i < n){
            if(start[i] < end[j]){
                rooms = rooms + 1;
                i++;
            }else{
                rooms = rooms - 1;
                j++;
            }
            maxrooms = Math.max(maxrooms,rooms);
        }
        return maxrooms;
    }
}