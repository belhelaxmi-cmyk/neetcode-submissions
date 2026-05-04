class Solution {
    int[] searchRange(int[] nums, int target) {
        return new int[] {first(nums, target), last(nums, target)};
    }
    int first(int[] a, int t) {
        int l = 0, r = a.length - 1, ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] >= t)
                r = m - 1;
            else
                l = m + 1;
            if (a[m] == t)
                ans = m;
        }
        return ans;
    }
    int last(int[] a, int t) {
        int l = 0, r = a.length - 1, ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] <= t)
                l = m + 1;
            else
                r = m - 1;
            if (a[m] == t)
                ans = m;
        }
        return ans;
    }
}