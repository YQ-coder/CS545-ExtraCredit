class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> stack = new ArrayDeque<>();
        Map< Integer, Integer> map = new HashMap<>();
        for (int num: nums2 ){
            while (!stack.isEmpty() && stack.peek()< num) {
                map.put(stack.pop(), num);
            }
        stack.push(num);
    }
    int[] ans = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
        ans[i] = map.getOrDefault(nums1[i], -1);
    }
    return ans;
    }
}
        
    //     int[] ans = new int[nums1.length];
    //     for(int i = 0; i < nums1.length; i++) {
    //         int max = -1;
    //         for(int j = 0; j < nums2.length; j++) {
    //             if (nums1[i] == nums2[j]) {
    //                 for (int k = j + 1; k < nums2.length; k++) {
    //                     if (nums2[k] > nums2[j]){
    //                         max = nums2[k];
    //                         break;
    //                     }
    //                 }
    //                 break;
    //             }
    //         }
    //         ans[i] = max;
    //     }
    //     return ans;
    // }

