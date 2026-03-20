// leetcode problem : https://leetcode.com/problems/merge-intervals/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PMergeIntervalsOne {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();
        for (int[] cur : intervals) {
            if (res.isEmpty()) {
                res.add(cur);
            } else {
                int[] last = res.get(res.size() - 1);
                if (last[1] < cur[0]) {
                    res.add(cur);
                } else {
                    last[1] = Math.max(last[1], cur[1]);
                }
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
