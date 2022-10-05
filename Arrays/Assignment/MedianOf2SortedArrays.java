class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //T(n): O(log(min(n1, n2)))
        int n1 = nums1.length;
        int n2 = nums2.length;
        if (n2 < n1) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int part = (n1 + n2 + 1) / 2;
        int cut1, cut2, l1, l2, r1, r2;
        int l = 0, h = n1;
        double ans = 0;
        //Binary search on minlen array
        while (l <= h) {
            cut1 = (l + h) / 2; //no.of elements left
            cut2 = part - cut1; //no.of elements right
            
            if (cut1 == 0) l1 = Integer.MIN_VALUE;
            else l1 = nums1[cut1 - 1];
                
            if (cut1 == n1) r1 = Integer.MAX_VALUE;
            else r1 = nums1[cut1];
            
            if (cut2 == 0) l2 = Integer.MIN_VALUE;
            else l2 = nums2[cut2 - 1];
            
            if (cut2 == n2) r2 = Integer.MAX_VALUE;
            else r2 = nums2[cut2];
            
            if (l1 <= r2 && l2 <= r1) {
                if ((n1 + n2) % 2 == 0) {
                    ans = (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } else {
                    ans = Math.max(l1, l2);
                }
                return ans;
            } else if (l1 > r2) {
                h = cut1 - 1;
            } else {
                l = cut1 + 1;
            }
        }
        return ans;
    }
}
